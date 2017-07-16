package com.workstatus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.workstatus.domain.EmployeeDetails;

@Controller 
@RequestMapping("/workstatus")
public class LoginController {
	
	
	@RequestMapping("/login")
	 public ModelAndView getLogin() {
		System.out.println("am here");
	  return new ModelAndView("login");
	 }
	
	@RequestMapping("/Checklogin")
	public ModelAndView checkLogin(HttpServletRequest request,HttpServletResponse response)
		{
		
		EmployeeDetails empd=new EmployeeDetails();
		String username=empd.getUsername();
		String password=empd.getPassword();
		String usernameequal=request.getParameter("");
		String passwordequal=request.getParameter("");
		if(username=="rishika"&&password=="AdminIndian")
		{
			 return new ModelAndView("login");
		}
		else if(username==usernameequal &&password==passwordequal)
		{
			
			 return new ModelAndView("login");
		}
		return null;
		
	}

}
