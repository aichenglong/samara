package org.samaraframework.system.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.samaraframework.system.domain.ActiveUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/first")
	public String first(Model model) throws Exception {
		// 从shiro的session中取activeUser
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		model.addAttribute("activeUser", activeUser);
		return "/index";
	}

	@RequestMapping("/welcome")
	public String welcome(Model model) throws Exception {

		return "/welcome";
	}
}
