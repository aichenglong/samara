package org.samaraframework.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.samaraframework.system.domain.ActiveUser;
import org.samaraframework.system.domain.SysPermission;
import org.samaraframework.system.domain.SysUser;
import org.samaraframework.system.mapper.SysUserMapper;
import org.samaraframework.system.service.SysService;
import org.springframework.stereotype.Service;

@Service("sysService")
public class SysServiceImpl implements SysService {

	@Resource
	private SysUserMapper sysUserMapper;

	@Override
	public ActiveUser authenticat(String userCode, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysUser findSysUserByUserName(String userCode) throws Exception {
		
		SysUser sysUser = new SysUser();
		sysUser.setUserCode(userCode);
		List<SysUser> sysUsers = sysUserMapper.findByEntity(sysUser);
		if (null == sysUser || sysUsers.size() == 0) {
			return null;
		}
		return sysUsers.get(0);
	}

	@Override
	public List<SysPermission> findSysPermissionListByUserId(String userid, String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
