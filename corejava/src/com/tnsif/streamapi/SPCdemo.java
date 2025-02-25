package com.tnsif.streamapi;

import java.util.function.Predicate;

public class SPCdemo {
	
	public static void main(String[] args) {
		Predicate<Integer> iseven=number->number%2==0;
		{
			int testnumber=11;
			if(iseven.test(testnumber)) {
				System.out.println(testnumber+"is even");
			}
			else {
				System.out.println("is odd");
			}
		}
	}

}
