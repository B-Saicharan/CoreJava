package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<String>();
		al.add("banana");
		al.add("orange");
		al.add("mango");
		al.add("guava");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
