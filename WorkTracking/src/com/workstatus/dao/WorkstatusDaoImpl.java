package com.workstatus.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.workstatus.domain.NewEmpdetails;

@Repository("WorkstatusDao")
public class WorkstatusDaoImpl implements WorkstatusDao {

	@Autowired(required=true)
	SessionFactory sessionFactory;
	
	public boolean saveEmployeeDetails(NewEmpdetails newEmpdetails) 
	
	{
		Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  boolean flag=false;
	  
	  session.saveOrUpdate(newEmpdetails);
	  tx.commit();
	 
	  session.close();
	  flag=true;
	  return flag;
		
}

	@SuppressWarnings("unchecked")
	@Override
	public List<NewEmpdetails> hardwareEmplist() {
		Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  String hardware="IT-Hardware";
		String hql = "FROM NewEmpdetails v WHERE v.EmployeeType='"+hardware+"'";

		List<NewEmpdetails> list = session.createQuery(hql).list();
		tx.commit();
		 
		  session.close();
		return list;
	}

	@Override
	public List<NewEmpdetails> softwareEmplist() {
		
		Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  String hardware="IT-Software";
		String hql = "FROM NewEmpdetails v WHERE v.EmployeeType='"+hardware+"'";

		List<NewEmpdetails> list = session.createQuery(hql).list();
		tx.commit();
		 
		  session.close();
		return list;
	}

	@Override
	public List<NewEmpdetails> officeEmplist() {
		Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  String hardware="IT-Office";
		String hql = "FROM NewEmpdetails v WHERE v.EmployeeType='"+hardware+"'";

		List<NewEmpdetails> list = session.createQuery(hql).list();
		tx.commit();
		 
		  session.close();
		return list;
	}
}
