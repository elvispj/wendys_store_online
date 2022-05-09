package com.store.online.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/log")
public class LoginController {
	private Logger log = Logger.getLogger(LoginController.class);
	
	@RequestMapping("/in")
	public String logIn(Model theModel, HttpServletRequest request)
	{
		log.info("Inicia login");
		request.getSession().invalidate();
		return "login";
	}
}
