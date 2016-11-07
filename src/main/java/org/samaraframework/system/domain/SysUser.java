package org.samaraframework.system.domain;

import java.util.Date;

public class SysUser  implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2553745274453047030L;
	
	private String id;
	private String userName;// 用戶名
	private String userCode;// 姓名
	private String email;// 郵箱
	private String password;// 密码
	private String salt;// 盐值
	private Integer locked;// 是否锁定
	private Date lastTime; // 最后一次登录时间
	private String lastIp;// 最后一次登录的ip
	private Integer available = 0;// 是否可用

	public String getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public void setId(String id) {
		this.id = id;
	}

}
