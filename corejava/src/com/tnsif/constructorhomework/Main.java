package com.tnsif.constructorhomework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an object of Student class
        Student student = new Student();

        // Create an object of Commission class
        Comission commission = new Comission();
        
        // Accept details of the sales employee
        commission.acceptDetails("John Doe", "1234 Elm Street", 123-456-7890, 75000);

        // Calculate and display the commission
        double commissionAmount = commission.calculateCommission();
        System.out.println("Commission Amount: " + commissionAmount);

	}

}
