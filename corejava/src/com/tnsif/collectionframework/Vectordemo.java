package com.tnsif.collectionframework;

import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v=new Vector<String>();
		int size=v.capacity();
		System.out.println(size);
		v.add("blue");
		v.add("red");
		v.add("pink");
		int cap1=v.capacity();
		System.out.println(cap1);
		System.out.println(v);
		

	}

}
