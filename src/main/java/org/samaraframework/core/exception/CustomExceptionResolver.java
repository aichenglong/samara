package org.samaraframework.core.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局的异常处理器
 * 
 * @author ACL
 *
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerExceptionResolver#resolveException
	 * (javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object,
	 * java.lang.Exception)
	 */
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		CustomException customException = null;
		if (ex instanceof CustomException) {
			customException = (CustomException) ex;
		} else {
			customException = new CustomException("未知错误");
		}
		//获取异常信息 定向到异常页面
		String message = customException.getMessage();
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("error");
		
		return modelAndView;

	}
}
