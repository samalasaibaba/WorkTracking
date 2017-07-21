package com.workstatus.dao;


import java.util.List;

import com.workstatus.domain.NewEmpdetails;

public interface WorkstatusDao {
	public boolean saveEmployeeDetails(NewEmpdetails newEmpdetails) ;
	public List<NewEmpdetails> hardwareEmplist();
	public List<NewEmpdetails> softwareEmplist();
	public List<NewEmpdetails> officeEmplist();
}


