package com.tnsif.polymorphism;
// demo for method overloading
public class Point {
	
	private float x;
	private float y;
	//default
	public Point() {
		x=9.0f;
		y=8.07f;
	}
	//parameterized
	public Point(float f) {
	this.x=x;
	y=6.5f;
	}
	//2 parameter
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
		
	}
public static void main(String[] args) {
	Point p =new Point();
	System.out.println(p);
	Point p1=new Point(7f);
	System.out.println(p1);
	Point p2=new Point(5.6f,8.2f);
	System.out.println(p2);
	
}
}

