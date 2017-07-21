package com.workstatus.controller;

import java.util.Map;

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
	public String checkLogin(HttpServletRequest request,HttpServletResponse response,Map<String, Object> model)
		{
		
		String adminusername=request.getParameter("adminuname");
		String adminpassword=request.getParameter("adminpassword");
		System.out.println(adminusername+" "+adminpassword);
		/*EmployeeDetails empd=new EmployeeDetails();
		String username=empd.getUsername();
		String password=empd.getPassword();*/
	
		if(adminusername.equals("rishika")&adminpassword.equals("AdminIndian"))
		{
			 return "Employeedetails";
		}
		else {
			model.put("message", "Enter valid UserName & Password");
			return "login";
		}
		}
		@RequestMapping("/newemployee")
		 public ModelAndView newEmployee() {
			System.out.println("am here");
		  return new ModelAndView("SignUp");
		 }

	
}
