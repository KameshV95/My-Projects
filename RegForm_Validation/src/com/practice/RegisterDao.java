package com.practice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.EmployBean;

public class RegisterDao {
	
	EmployBean epb = new EmployBean();
	Connection con = null;
	PreparedStatement ps=null;
	
	public int register(EmployBean epb) throws SQLException, ClassNotFoundException {
		con= DbConnection.getConnection();
		
		int insertedRows=0;
		String query= "insert into Employee_Registration_Form values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		ps=con.prepareStatement(query);
		
		ps.setInt   (1, epb.getEid());
		ps.setString(2, epb.getFirstName());
		ps.setString(3, epb.getMiddleName());
		ps.setString(4, epb.getLastName());
		ps.setString(5, epb.getDob());
		ps.setString(6, epb.getGender());
		ps.setLong  (7, epb.getPhoneNumber());
		ps.setString(8, epb.getEmailId());
		ps.setString(9, epb.getpAddress());
		ps.setString(10,epb.getCity());
		ps.setString(11,epb.getState());
		ps.setString(12,epb.getCountry());
		
		 insertedRows=ps.executeUpdate();
		
		System.out.println(insertedRows+":- Are Inserted");
		
		
//		String query = "select * from Employee_Registration_Form";
//		ps.executeQuery(query);
		
		return insertedRows;
		
		
	}

	
	

}