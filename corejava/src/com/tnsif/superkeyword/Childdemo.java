package com.tnsif.superkeyword;

public class Childdemo extends Parentdemo {
	 
	int a=7;
	void drunk() {
		System.out.println("boost");
	}
	void display() {
		System.out.println(a);
		System.out.println(super.a);
		drunk();
		super.drunk();
	}
 
	public static void main(String[] args) {
		
		Childdemo d=new Childdemo();
		d.display();
	}

}
