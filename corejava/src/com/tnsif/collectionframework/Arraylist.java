package com.tnsif.collectionframework;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(8);
		al.add(5);
		al.add(9);
		System.out.println("size"+al.size());
		System.out.println(al);
System.out.println(al.contains(2));
		
		// check the list is empty or not
		System.out.println(al.isEmpty());
		
		// remove the elemnt
		
		System.out.println(al.remove(0));
		System.out.println(al);
	}

}
