package com.saicharan.assignment;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		int b;
		int sum=0;
		while(a>0) {
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println(sum);

	}
}
