package com.tnsif.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void treesetoperation() {
		TreeSet<Integer>t=new TreeSet<Integer>();
		t.add(34);
		t.add(24);
		t.add(64);
		t.add(14);
		
		Iterator itr=t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
public static void main(String[] args) {
	Treeset.treesetoperation();
}
}
