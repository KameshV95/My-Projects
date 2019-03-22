package com.kamesh;

public class Basic {
	public void method1() {
		synchronized (String.class){
			System.out.println("Lock Accuried on String Class");
			
	    synchronized (Integer.class) {
			System.out.println("Lock Accuried on Integer Class");
		}	 
		}
	}
	
	public void method2(){
		
	    synchronized (Integer.class) {
			System.out.println("Lock Accuried on Integer Class");
			
			synchronized (String.class){
				System.out.println("Lock Accuried on String Class");
				
		}	 
		}
		
	}
	public static void main(String[] args) {
		
		/*Basic bs = new Basic();
		bs.method1();
		bs.method2();*/
		
		System.out.println("Not in Dead Lock State");
		
	}

}
