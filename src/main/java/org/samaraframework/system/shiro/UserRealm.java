package org.samaraframework.system.shiro;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.samaraframework.system.domain.ActiveUser;
import org.samaraframework.system.domain.SysPermission;
import org.samaraframework.system.domain.SysUser;
import org.samaraframework.system.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

	@Autowired
	private SysService SysService;

	
	@Override
	public void setName(String name) {
		super.setName("userRealm");
	}
	// 认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 获取用户的身份信息
		String userCode = (String) token.getPrincipal();
		SysUser sysUser = null;
		try {
			sysUser = SysService.findSysUserByUserName(userCode);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if (null == sysUser) {
			return null;
		}
		String password = sysUser.getPassword();
		String salt = sysUser.getSalt();
		ActiveUser activeUser = new ActiveUser();
		activeUser.setSysUser(sysUser);

		// 获取用户菜单
		List<SysPermission> menus = null;
		try {
			menus = SysService.findSysPermissionListByUserId(sysUser.getId(), "menu");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		activeUser.setMenus(menus);

		// 将activeUser设置simpleAuthenticationInfo
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(activeUser, password,
				ByteSource.Util.bytes(salt), this.getName());

		return simpleAuthenticationInfo;
	}

	// 授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

}
