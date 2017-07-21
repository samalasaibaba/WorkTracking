package com.workstatus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workstatus.dao.WorkstatusDao;

import com.workstatus.domain.NewEmpdetails;

@Repository("WorkService")
public class WorkserviceImpl implements WorkService {
	@Autowired(required=true)
	WorkstatusDao workstatusDao;
	
	public boolean saveEmployeeDetails(NewEmpdetails newEmpdetails) {
		System.out.println("am in dao");
		return workstatusDao.saveEmployeeDetails(newEmpdetails);
	}

	@Override
	public List<NewEmpdetails> hardwareEmplist() {
		// TODO Auto-generated method stub
		return workstatusDao.hardwareEmplist();
	}

	@Override
	public List<NewEmpdetails> softwareEmplist() {
		// TODO Auto-generated method stub
		return workstatusDao.softwareEmplist();
	}

	@Override
	public List<NewEmpdetails> officeEmplist() {
		// TODO Auto-generated method stub
		return workstatusDao.officeEmplist();
	}

}
