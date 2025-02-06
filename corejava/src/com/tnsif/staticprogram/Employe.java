package com.tnsif.staticprogram;

public class Employe {
	
	int id;
	String name;
	static String college="tkr";
	
	Employe(int n,String m){
		id=n; 
		name=m;
	}
	void display() {
		System.out.println(id+""+name+""+college);
	}
	public static void main(String[] args) {
		Employe d=new Employe(1,"sai");
		Employe d2=new Employe(2,"ramu");
d.display();
d2.display();
}
}