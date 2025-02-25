package com.tnsif.exceptionhandling;

import java.io.IOException;

public class Throwsdemo {
void m1() {
	System.out.println("hello");
}
void m2() throws IOException{
	throw new StringIndexOutOfBoundsException("you are not elgible");
	//System.out.println("imp");
}
void m3() throws ArithmeticException, ArrayIndexOutOfBoundsException{
	System.out.println("sampled");
}
public static void main(String[] args) {
	Throwsdemo d=new Throwsdemo();
			d.m1();
			try {
				d.m2();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				d.m3();
			}
			catch(Exception f) {
				System.out.println(f.getMessage());
			}
}


}
