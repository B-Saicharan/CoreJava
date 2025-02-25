package com.tnsif.exceptionhandling;
//demo for throw
public class Throwdemo {
	public void validate(int age) {
try {
	if(age<18) {
		throw new ArithmeticException("you are not elgible");
	}
	else {
		System.out.println("you are elgible");
	}}
	catch(Exception e) {
		System.out.println(e);
		
	}
}
	public static void main(String[] args) {
		Throwdemo d=new Throwdemo();
		d.validate(5);
	}
}
