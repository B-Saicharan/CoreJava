package com.tnsif.collectionframework;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> ob=new Stack<Integer>();
		ob.add(5);
		ob.add(3);
		ob.add(6);
		ob.add(8);
		
		System.out.println(ob);
		
		System.out.println(ob.search(4));
		System.out.println(ob.size());
		System.out.println(ob.pop());
		System.out.println(ob);
		ob.add(25);
		System.out.println(ob);
		if(ob.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("is not empty");
		}

	}

}
