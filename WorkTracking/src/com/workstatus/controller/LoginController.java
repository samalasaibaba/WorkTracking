package com.workstatus.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping("/workstatus")
public class LoginController {
	
	
	@RequestMapping("/login")
	 public ModelAndView getLogin() {
		System.out.println("am here");
	  return new ModelAndView("login");
	 }
	

}
