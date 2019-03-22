package org.hbm.test;

import java.util.Scanner;

import org.hbm.dao.EmployeeDao;
import org.hbm.entites.EmployeeDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Setting Data to Entity  Object;
		EmployeeDetails empd = new EmployeeDetails();
		empd.setEmpId(302);
		empd.setEmpName("Rohit");
		empd.setEmpPhNum(7227737597l);
		empd.setEmpMailId("Rohit7347@gmail.coom");
		
		//Calling Dao Method
		
		EmployeeDao edao = new EmployeeDao();
		boolean isInsert = edao.insert(empd);
		System.out.println("Values Inserted :- "+isInsert);
		
	    System.out.println(empd);
	    
		
	}

}
