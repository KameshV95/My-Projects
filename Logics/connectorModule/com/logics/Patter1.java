package com.logics;

public class Patter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>1;i--) {
			for(int j=i-1;j>=0;j--) {
				System.out.print("*");
			}		
		
		System.out.println();	
		}

		for(int k=5;k>=1;k--) {
			for(int j=k;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}