package com.workstatus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workstatus.dao.WorkstatusDao;
import com.workstatus.domain.EmployeeDetails;

@Repository("WorkService")
public class WorkserviceImpl implements WorkService {
	@Autowired(required=true)
	WorkstatusDao workstatusDao;
	public void saveEmployeeDetails(EmployeeDetails employeeDetails1) {
		 workstatusDao.saveEmployeeDetails(employeeDetails1);
	}

}
