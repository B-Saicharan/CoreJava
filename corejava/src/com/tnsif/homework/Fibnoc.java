package com.tnsif.homework;

import java.util.Scanner;

public class Fibnoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int count=2;
		while(count<=n) {
			int temp=b;

			b=b+a;
			a=temp;
			count++;
		}
		System.out.println(b);

	}

}
