package com.tnsif.streamapi;

import java.util.stream.Stream;

public class Skipmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(1,2,3,4,5,6,7,8,9).filter(num->num%2==0)//filter data
		.skip(2)//skip first two
		.forEach(num->System.out.println(num+" "));//pricing elements

	}

}
