package com.rest.example;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LogDataDao {

	public void SaveLog(LogData log_d) throws Exception {
		
		Transaction trn =null;
		
		SessionFactory sf = new Configuration().configure("/com/rest/example/Hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		
		try {
			
			trn=(Transaction) s.beginTransaction();	
			s.save(log_d);
			trn.commit();
		}
		catch(HibernateException e) {
			if(trn!=null) {				
				trn.rollback();
			}			
		}
		
	}
}
