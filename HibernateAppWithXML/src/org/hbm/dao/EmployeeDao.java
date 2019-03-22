package org.hbm.dao;

import java.io.Serializable;

import org.hbm.entites.EmployeeDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {
	public boolean insert(EmployeeDetails empd) {
		boolean isInsert=false;
		try {
			Configuration cfg = new Configuration();
			cfg=cfg.configure("org/hbm/cfg/hibernate.cfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();
			Session ses = sf.openSession();
			
			Transaction tx=ses.beginTransaction();  
			Serializable ser =ses.save(empd);
			if(ser!=null) {
				isInsert = true;
			}
			
			tx.commit();
			ses.close();
			sf.close();		

		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return isInsert;
		
	}

}
