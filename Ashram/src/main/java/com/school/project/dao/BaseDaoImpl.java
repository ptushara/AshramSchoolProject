package com.school.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImpl implements BaseDao{

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public Session currentSession(){
		Session sess=null;
		try {         
		       sess = sessionFactory.getCurrentSession();  
		   } catch (org.hibernate.HibernateException he) {  
		       sess = sessionFactory.openSession();     
		   }   
		return sess;
	}
	
	public <T> T save(final T o) {
		return (T) this.currentSession().save(o);
	}

	public <T> void saveOrUpdate(final T o) {
		  this.currentSession().save(o);
	}


}
