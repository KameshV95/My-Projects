<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.bean.EmployBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue" >
<%
  Object obj =session.getAttribute("RegSerObj");
if(obj!=null){
	EmployBean emb =(EmployBean)obj;
	//out.println(emb.getEid());
%>
<h2> </h2>
<table border="2">
  <tr>
  <th>EmployId</th><br><th>FName</th><th>MName</th><th>LName</th><th>DOB</th><th>Gender</th>
  <th>Phone Number</th><th>Mail</th><th>Address</th><th>City</th><th>State</th><th>Country</th>
  </tr>
  
  <tr>
  <td><% out.println(emb.getEid()); %></td>
  <td><% out.println(emb.getFirstName()); %></td>
  <td><% out.println(emb.getMiddleName()); %></td>
  <td><% out.println(emb.getLastName()); %></td>
  <td><% out.println(emb.getDob()); %></td>
  <td><% out.println(emb.getGender()); %></td>
  <td><% out.println(emb.getPhoneNumber()); %></td>
  <td><% out.println(emb.getEmailId()); %></td>
  <td><% out.println(emb.getpAddress()); %></td>
  <td><% out.println(emb.getCity()); %></td>
  <td><% out.println(emb.getState()); %></td>
  <td><% out.println(emb.getCountry()); %></td>
  </tr>
  
</table>

 
<% }%>


</body>
</html>