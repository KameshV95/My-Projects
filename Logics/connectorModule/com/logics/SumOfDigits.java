package com.logics;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long n,c,sum=0;
		 System.out.println("Enter a Number");
		 Scanner sc =new Scanner(System.in);
		 n=sc.nextLong();
		 System.out.print("Sum of Digits=");
		 while(n>0) {
			  c=n%10;
			  n=n/10;
			  sum=sum+c;
			  
		}
		 System.out.println(sum);
		 

	}

}
