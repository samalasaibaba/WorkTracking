package com.workstatus.dao;

import java.io.Serializable;

import javax.mail.Session;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workstatus.exception.FMSGenericException;
import com.workstatus.domain.EmployeeDetails;

@Repository("WorkstatusDao")
public class WorkstatusDaoImpl implements WorkstatusDao {

	@Autowired(required=true)
	SessionFactory sessionFactory;
	
	public void saveEmployeeDetails(EmployeeDetails employeeDetails1) {
		try {
			org.hibernate.classic.Session session = sessionFactory
					.getCurrentSession();
		session.save(employeeDetails1);
		} catch (HibernateException he) 
		{
			throw new FMSGenericException(he + "");
		}
	}
}
