package com.tnsif.interfacedemo;

public class parentchildclass implements Childinterface,Parentinterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method 
		System.out.println("tharun ");
		
	}
public static void main(String[] args) {
	parentchildclass d=new parentchildclass();
	d.print();
	d.show();
}
}
