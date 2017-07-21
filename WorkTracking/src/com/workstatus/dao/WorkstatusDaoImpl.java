package com.workstatus.dao;

import java.io.Serializable;

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
}
