package com.workstatus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workstatus.dao.WorkstatusDao;

import com.workstatus.domain.NewEmpdetails;

@Repository("WorkService")
public class WorkserviceImpl implements WorkService {
	@Autowired(required=true)
	WorkstatusDao workstatusDao;
	
	public int saveEmployeeDetails(NewEmpdetails newEmpdetails) {
		System.out.println("am in dao");
		return workstatusDao.saveEmployeeDetails(newEmpdetails);
	}

}
