package com.tnsif.staticprogram;

public class Student {
int n;
String name;
static String campus="tcs";

static void change() {
	campus="teegala";
}
Student(int r, String m){
	n=r;
	name=m;
}
void display() {
	System.out.println(n+""+name+""+campus);
}
public static void main(String[] args) {
	Student.change();
	Student s1=new Student(1,"sai");
	s1.display();
	
}
}
