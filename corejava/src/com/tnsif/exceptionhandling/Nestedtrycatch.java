package com.tnsif.exceptionhandling;

public class Nestedtrycatch {
public static void check() {
	String str="tns";
	int slength=str.length();
	System.out.println("length"+slength);
String anotherstrng=null;
int y=6;
try {
	try {
		System.out.println(str.charAt(y));
	}
	catch(StringIndexOutOfBoundsException e){
		System.out.println("index out of bound"+e.getMessage());
		
	}
	System.out.println("stringlength"+anotherstrng.length());
}
catch(NullPointerException m) {
	System.out.println("exception"+m.getMessage());
	
}
}

}
 