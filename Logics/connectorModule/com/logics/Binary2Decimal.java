package com.logics;

import java.util.ArrayList;
import java.util.Scanner;

public class Binary2Decimal {
	public static void main(String[] args){
		int decimal,a,count=0,pos=0;
		System.out.println("Enter Decimal Number");
		Scanner sc = new Scanner(System.in);
		decimal=sc.nextInt();
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		if(decimal==0) {
			System.out.println("Decimal Number Should be greater than 1");
			System.exit(0);
		}
		while (decimal>=1) {
			Integer i = decimal%2;
		    al.add(i);
		    decimal=decimal/2;
		    if(i==1) {
		    	count++;
		    }
		  }
		System.out.print("Binary Value Is:");
		for( int i=(al.size()-1);i>=0;i--) {
			System.out.print(al.get(i));
		}
		System.out.println();
		System.out.println("Number of Ones are:-"+ count);
		System.out.print("Index position of one's are:-");
		for(int i =(al.size()-1);i>=0;i--){
			if(al.get(i)==1) {
				System.out.print(pos+",");	
			}
			pos++;
			
		}
	}

}
