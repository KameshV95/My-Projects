package hbm.test;

import hbm.dao.One2ManyDao;
import hbm.dao.One2ManyFactory;
import hbm.util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {

		
		One2ManyDao dao=One2ManyFactory.getInstance();
		dao.saveData();
		dao.deleteOneUserNumber();
		HibernateUtil.closeSession();
		HibernateUtil.closeSessionFactory();	
	}

}
