package org.samaraframework.system.service;

import java.util.List;

import org.samaraframework.system.domain.ActiveUser;
import org.samaraframework.system.domain.SysPermission;
import org.samaraframework.system.domain.SysUser;

/**
 * 认证授权服务接口
 * 
 * @author ACL
 *
 */
public interface SysService {
	// 根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
	public ActiveUser authenticat(String userCode, String password) throws Exception;

	// 根据用户的账号查询用户信息
	public SysUser findSysUserByUserName(String userCode) throws Exception;

	// 根据用户id和类型查询权限资源或菜单
	public List<SysPermission> findSysPermissionListByUserId(String userid, String type) throws Exception;

}
