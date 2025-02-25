package com.tnsif.lambdaexpression;

public class Squareparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square ob=(a)->{return (a*a);};
		System.out.println(ob.calculate(3));

	}

}
