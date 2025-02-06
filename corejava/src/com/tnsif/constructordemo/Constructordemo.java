package com.tnsif.constructordemo;

import java.util.Scanner;

public class Constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name");
		
		String name=sc.next();
		System.out.println("enter customer id");
		
		int id=sc.nextInt();

		System.out.println("enter customer address");
		
		String address=sc.next();
		Customer c=new Customer();
		
		c.setCustomername(name);
		c.setCustomerid(id);
		c.setCustomeradress(address);
		System.out.println(c);
		
		boolean out=c instanceof Customer;
		System.out.println(out);
	}

}
