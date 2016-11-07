package org.samaraframework.system.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.samaraframework.core.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


	@RequestMapping(value = "login")
	public String login(HttpServletRequest request) throws Exception {
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		if (exceptionClassName != null) {
			if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
				// 最终会抛给异常处理器
				throw new CustomException("账号不存在");
			} else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
				throw new CustomException("用户名/密码错误");
			} else if ("randomCodeError".equals(exceptionClassName)) {
				throw new CustomException("验证码错误 ");
			} else {
				throw new Exception();// 最终在异常处理器生成未知错误
			}
		}
		return "login";
	}
}
