package com.tnsif.homework;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		while(n>0) {
			int a=n%10;
			n/=10;
			c=c*10+a;
		//
		}
		System.out.println(c);

	}

}
