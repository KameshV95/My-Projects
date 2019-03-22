package com.logics;

import java.util.HashMap;
import java.util.Scanner;

public class FinalCount {
	public static void main(String[] args) {
		
		int count=1,i;
		System.out.println("Enter Your String");
		Scanner sc =new Scanner(System.in);
		String str =sc.nextLine();
		String[] str1=str.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for( i=0;i<str1.length;i++) {
			if(hm.containsKey(str1[i])) {
			 count=hm.get(str1[i]);
			hm.put(str1[i], count+1);
		}
		else {
			hm.put(str1[i],1);
		}
	}
		System.out.println(hm);
}
}
