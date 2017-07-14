package com.workstatus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
public class EmployeeDetails {
	@Id
	@Column(name="EID")
	private Integer EmployeeId;
	
	@Column(name="UserName")
	private String username;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Full_Name")
	private String fullname;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Contact_Number")
	private String contactnumber;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	
	
	

}
