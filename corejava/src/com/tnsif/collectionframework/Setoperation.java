package com.tnsif.collectionframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setoperation {
public static void operation() {
	Set<Integer> ob=new HashSet<Integer>();
	ob.add(45);
	ob.add(15);
	ob.add(95);
	ob.add(35);
	System.out.println(ob);
	ob.addAll(Arrays.asList(new Integer[] {1,5,6}));
	System.out.println(ob);
	System.out.println(ob.size());
	Set<Integer> oddset=new HashSet<Integer>();
	oddset.addAll(Arrays.asList(new Integer[] {3,5,9}));
	
	System.out.println(oddset);
	//Set<Integer> intersection=new HashSet<Integer>();
	Set<Integer> intersection=new HashSet<>(ob);
	
	intersection.retainAll(oddset);
	
	System.out.println(intersection);

	
}
}
