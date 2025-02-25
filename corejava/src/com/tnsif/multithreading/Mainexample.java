package com.tnsif.multithreading;
class Eclip implements Runnable{
	
	public void run() {
		System.out.println("Eclip "+ Thread.currentThread().getId());
	}
}
 class Flipkart implements Runnable{
	 public void run() {
		 System.out.println("Flipkart "+ Thread.currentThread().getId()); 
	 }
 }

public class Mainexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclip e=new Eclip();
		Thread obj=new Thread(e);
		obj.start();
		
		Flipkart f=new Flipkart();
		Thread obj1=new Thread(f);
		obj1.start();
		
		System.out.println("mainmethod "+ Thread.currentThread().getId()); 
		

	}

}
