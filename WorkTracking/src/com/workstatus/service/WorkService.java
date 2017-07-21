package com.workstatus.service;


import com.workstatus.domain.NewEmpdetails;

import java.util.*;

public interface WorkService {
	public boolean saveEmployeeDetails(NewEmpdetails newEmpdetails) ;
	public List<NewEmpdetails> hardwareEmplist();
	public List<NewEmpdetails> softwareEmplist();
	public List<NewEmpdetails> officeEmplist();
}
