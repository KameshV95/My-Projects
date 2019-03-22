package hbm.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	private static SessionFactory sf;
	
	static {
		Configuration cfg= new Configuration();
		cfg=cfg.configure("/hbm/cfgs/hibernate.configuration.xml");
		try {
			sf=cfg.buildSessionFactory();
		} 
		
		catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	
	public static Session getSession() {
		Session session=null;
		if(threadLocal.get()==null) {
			session=sf.openSession();
			threadLocal.set(session);
	}
		session=threadLocal.get();
		return session;
	}

	 public static void closeSession() {
		 Session session=null;
		 session=threadLocal.get();
		 session.close();
		 threadLocal.remove();
	 }
	 
	 public static void closeSessionFactory() {
		 sf.close();
	 }
	
}
