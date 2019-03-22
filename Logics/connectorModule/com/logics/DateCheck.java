package com.logics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCheck  {
	
	public static void main(String[] args) throws ParseException {
	
	System.out.println("Enter Your Date Of Birth");
	Scanner sc = new Scanner(System.in);
	String dob=sc.next();
    SimpleDateFormat sformat= new SimpleDateFormat("dd/MM/yyyy");
    Date date= new Date();
    System.out.println(sformat.format(date));
    int currentDate=date.getYear();	
	System.out.println(currentDate);
    
	Date edob =sformat.parse(dob);
	System.out.println(edob);
	String sysDate=sformat.format(date);
	Date cdate=sformat.parse(sysDate);
	
	
	 currentDate=date.getYear();	
	System.out.println(currentDate);
	
	int enteredDate=edob.getYear();
	System.out.println(enteredDate);
	
	int result= (currentDate-enteredDate);
	System.out.println(result);
	
	 if(result>=18){
		 System.out.println("Success");
	 }	 
	else {
	System.out.println("Failure");

}
}
}