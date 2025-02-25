package com.tnsif.comparatordemo;

import java.util.Comparator;

public class Laptopcomparator implements Comparator<Laptop> {

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated ethod stub
		return Integer.compare(o1.getPrice(), o2.getPrice());
	}
	

	}

