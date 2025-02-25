package com.tnsif.multithreading;

public class Maindemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse e=new Eclipse();
		e.start();
		
		Notepad n=new Notepad();
		n.start();
		Chrome c=new Chrome();
		c.start();
		System.out.println("mainmethos"+Thread.currentThread().getId());

	}

}
