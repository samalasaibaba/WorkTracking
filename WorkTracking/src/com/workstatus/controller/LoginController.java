package com.workstatus.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.workstatus.domain.NewEmpdetails;
import com.workstatus.service.WorkService;

@Controller 
@RequestMapping("/workstatus")
public class LoginController {
	@Autowired(required=true)
	WorkService workService;
	
	
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
		@RequestMapping("/savenewemployee")
		 public ModelAndView savenewEmployee(@ModelAttribute("newEmpdetails")
		  NewEmpdetails newEmpdetails, Map<String, Object> model) throws Exception
		{
			System.out.println("am in contoller");
			boolean flag=false;
			 flag = workService.saveEmployeeDetails(newEmpdetails);
			
			
		  return new ModelAndView("Employeedetails");
		 }


		@RequestMapping("/hardwarelist")
				public ModelAndView hardwareList() {
				System.out.println("am here");
				
				workService.hardwareEmplist();
				System.out.println("am c here");
			  return new ModelAndView("Employeedetails");
			 }

		@RequestMapping("/softwrelist")
				public ModelAndView softwrelist() {
				System.out.println("am here");
			  return new ModelAndView("login");
			 }

		@RequestMapping("/officelist")
				public ModelAndView officelist() {
				System.out.println("am here");
			  return new ModelAndView("login");
			 }
			
		}
		

