package com.tnsif.polymorphism;

public class Car extends Vehicle {
	
	@Override
	void move() {
		System.out.println("HELLO");
	}
	void display()
	{
		super.move();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.move();
	c.display();

	}

}
