package com.tnsif.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laps=new ArrayList<Laptop>();
		laps.add(new Laptop("dell",5000,5));
		laps.add(new Laptop("cell",4000,8));
		laps.add(new Laptop("mell",6000,2));
		laps.add(new Laptop("bell",8000,9));
		
		
		Collections.sort(laps);
		
		for(Laptop l:laps) {
			System.out.println(l);
		}

	}

}
