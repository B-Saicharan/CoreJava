package com.tnsif.multithreading;

public class Chrome extends Thread {
	 public void run() {
		   System.out.println("Eclipse"+Thread.currentThread().getId());
	   }

}
