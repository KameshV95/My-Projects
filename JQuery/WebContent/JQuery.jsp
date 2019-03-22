<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JQuery</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="JQueryValidation.js"></script>
</head>
<body>

<table>
<tr>
<td><b><font color="sky blue">Employee Id:</font></b> <font color="red"><strong>*</strong></font></td> 
<td><input type=text  id="empid" name="empid" placeholder="Employee Id" size="25"></td>
</tr>

<tr>
<td><b><font color="sky blue">Employee Name:</font></b> <font color="red"><strong>*</strong></font></td> 
<td><input type=text  id="ename" name="ename" placeholder="Employee Name" size="25"></td>
</tr>

<tr>
<td>
 <input type="submit" value="Submit" onclick="return doJqValidation()">
 </td>
 </tr>
 
 <tr>
 <td>
  <span id="errorMsg"/>
 </td>
 </tr>         
</table>

</body>
</html>