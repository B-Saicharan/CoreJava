package com.tnsif.exceptionhandling;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(100/0);
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(f.getMessage());
		}
		finally {
			System.out.println("executed");
		}

	}

}
