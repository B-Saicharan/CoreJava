package com.tnsif.polymorphism;

public class Overloading {
	
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b, int c) {
		return a*b+c;
	}
public static void main(String[] args) {
	Overloading m=new Overloading();
	System.out.println(m.add(5, 6));
	System.out.println(m.add(2, 3, 4));
	
}
}
