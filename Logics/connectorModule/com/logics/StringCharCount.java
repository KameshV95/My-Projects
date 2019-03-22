package com.logics;

import java.util.Scanner;

public class StringCharCount {

	public static void main(String[] args) {
		int i,j, count=1;
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c = str.toLowerCase().toCharArray();
		//System.out.println(c[1]);
		
		for(i=0;i<c.length-1;i++) {
			for(j=i;j<c.length-1;j++) {
		//System.out.println(c[i]+","+c[j+1]);

				 if(c[i]==c[j+1]) {
					 ++count;
					System.out.println(c[i]+"-->"+count);
					count--;
					 }
					/*else if(c[i]!=c[j+1]) {
						System.out.println(c[j]+"--> "+ count);
					}*/
				}
			}
		}

}
