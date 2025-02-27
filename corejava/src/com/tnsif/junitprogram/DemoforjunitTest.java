package com.tnsif.junitprogram;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoforjunitTest {

	@Test
	void testAdd() {
	Demoforjunit d1=new Demoforjunit();
	int actual=d1.add(5,5);
	int expected=10;
	if(expected==actual) {
		System.out.println("passed");
	}
	else{
		System.out.println("fail");
	
	
	}
}
}