package com.tnsif.lambdaexpression;

public class Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube ob=(a)->{return (a*a*a);};
		System.out.println(ob.calculate(3));

	}

}
