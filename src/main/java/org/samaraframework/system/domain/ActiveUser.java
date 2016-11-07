package org.samaraframework.system.domain;

import java.util.List;

/**
 * 用户身份信息
 * 
 * @author ACL
 *
 */
public class ActiveUser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5734820981807546138L;

	private SysUser sysUser;//用户信息
	private List<SysRole> roles;// 角色组
	private List<SysPermission> menus;//菜单
	private List<SysPermission> sysPermissions;//资源 权限
	
	public SysUser getSysUser() {
		return sysUser;
	}

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	
	

	public List<SysPermission> getMenus() {
		return menus;
	}

	public void setMenus(List<SysPermission> menus) {
		this.menus = menus;
	}

	public List<SysRole> getRoles() {
		return roles;
	}

	public void setRoles(List<SysRole> roles) {
		this.roles = roles;
	}

	public List<SysPermission> getSysPermissions() {
		return sysPermissions;
	}

	public void setSysPermissions(List<SysPermission> sysPermissions) {
		this.sysPermissions = sysPermissions;
	}
	
	

}
