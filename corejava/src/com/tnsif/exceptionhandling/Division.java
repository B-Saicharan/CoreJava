package com.tnsif.exceptionhandling;

public class Division {
	public static void divide() {
		int a=6,b=0,c;
		try {
		c=a/b;
		System.out.println("dividion"+c);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exceptioncaught"+e.getMessage());
		}
		catch(IndexOutOfBoundsException d) {
			System.out.println("exceptioncaught"+d.getMessage());
		}
		
	}

}
