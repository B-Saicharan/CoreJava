package com.tnsif.exceptionhandling;

public class Withexception {
	public static void main(String[] args) {
		int d=0;
		try {
			int c=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("exception"+e);
			System.out.println("hello");
		}
		
		
	}

}