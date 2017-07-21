package com.workstatus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Newemp_details")
public class NewEmpdetails {
	@Id
	// Specifies the primary key generation
	@Column(name="EmployeeId")
	private String EmployeeId;
	
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
	
	@Column(name="Employee_type")
	private String EmployeeType;
	
	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

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

	public String getEmployeeType() {
		return EmployeeType;
	}

	public void setEmployeeType(String employeeType) {
		EmployeeType = employeeType;
	}

	
	

}
