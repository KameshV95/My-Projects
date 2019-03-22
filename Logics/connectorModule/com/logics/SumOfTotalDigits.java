package com.logics;

import java.util.Scanner;

public class SumOfTotalDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n,temp,s,sum=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a Number");
		  n=sc.nextLong();
		  temp=n;
		 System.out.print("Sum of Total Digits=");
		 while(temp>9)
		 {
		 sum=temp;
		 s=0;
		 while(sum!=0)
		 {
		 s=s+(sum%10);
		 sum=sum/10;
		 }
		 temp=s;
		 }
		 System.out.println(temp);
		
		 }
		
	}


