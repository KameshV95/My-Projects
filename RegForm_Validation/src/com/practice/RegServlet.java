package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

import com.bean.EmployBean;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType("text/html");
		/* ceating the object of PrinWriter*/
		 response.setContentType("text/html");

         PrintWriter pw = response.getWriter();

 		int Eid = Integer.parseInt(request.getParameter("Eid"));
 		pw.println("Employee Id   :- "+Eid);
 		
 		String fn= request.getParameter("firstName");
 		pw.println("First Name    :- "+fn);
 		
 		String mn= request.getParameter("middleName");
 		pw.println("Middle Name   :- "+mn);
 		
 		String ln= request.getParameter("lastName");
 		pw.println("Last Name     :- "+ln);
 		
 		String dob= request.getParameter("dob");
 		pw.println("Date of Birth :- "+dob);
 		
 		String gen = request.getParameter("gender");
 		pw.println("Gender        :- "+gen);
 		
 		long pn = Long.parseLong(request.getParameter("phoneNumber"));
 		pw.println("Phone Number  :- "+pn);
 		
 		String mail = request.getParameter("emailId");
 		pw.println("Email Id      :- "+mail);
 		
 		String addr= request.getParameter("pAddress");
 		pw.println("Address       :- "+addr);
 		
 		String city = request.getParameter("city");
 		pw.println("City          :- "+city);
 		
 		String state = request.getParameter("state");
 		pw.println("State         :- "+state);
 		
 		String country= request.getParameter("country");
 		pw.println("Country       :- "+country);
 		

	EmployBean eb = new EmployBean();
	
	 eb.setEid(Eid);
	 eb.setFirstName(fn);
	 eb.setMiddleName(mn);
	 eb.setLastName(ln);
	 eb.setDob(dob);
	 eb.setGender(gen);
	 eb.setPhoneNumber(pn);
	 eb.setEmailId(mail);
	 eb.setpAddress(addr);
	 eb.setCity(city);
	 eb.setState(state);
	 eb.setCountry(country);
	 
	 HttpSession session = request.getSession();
	 
	    session.setAttribute("RegSerObj",eb);
	    
	    RegisterDao rgd = new RegisterDao();
	    try {
			int regvalue=rgd.register(eb);
			if(regvalue==1) {
				System.out.println("row inserted");
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	        
	    		
	RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
	rd.forward(request,response);
	}
	
	/*pw.println("<html> <body>");
	pw.println("<form action='SecondServlet' method='get'");
	pw.println("<input type='submit'value='getValue'");
	pw.println("</form></body></body>");*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
