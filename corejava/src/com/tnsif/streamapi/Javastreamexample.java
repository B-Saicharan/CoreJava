package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamexample {
	public static void main(String[] args) {
		List<Product> op=new ArrayList<Product>();
		op.add(new Product(1,"hp",34000f));
		op.add(new Product(2,"bp",54000f));
		op.add(new Product(3,"cp",14000f));
		op.add(new Product(5,"dp",94000f));
//	
//	List<Float> pl= op.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
//	System.out.println(pl);
//
//}
//}
//filter datafilter
//map fetchingprice
//collect collecting as list
		
		
		double totalprice=op.stream().collect(Collectors.summingDouble(Product->Product.price));
		System.out.println(totalprice);
	

		// find the maximum product
		
		Product a=op.stream().max((pro1,pro2)-> pro1.price>pro2.price?1:-1).get();
		System.out.println(a.price);
		// find minimum product
		
		Product r=op.stream().min((pro1,pro2)-> pro1.price>pro2.price?1:-1).get();
		System.out.println(r.price);
		
		// count() method
		
		long count=op.stream().filter(product->product.price<5000).count();
		
		System.out.println(count);
	}

}