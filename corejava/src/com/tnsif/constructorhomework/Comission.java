package com.tnsif.constructorhomework;

public class Comission {
	String name;
	String Address;
	int Phone;
	double Sales_amount;
	
	// Method to accept details
    void acceptDetails(String name, String address, int phone, double sales_amount) {
        this.name = name;
        this.Address = address;
        this.Phone = phone;
        this.Sales_amount = sales_amount;
    }

    
 // Method to calculate commission
    double calculateCommission() {
        if (Sales_amount >= 100000) {
            return Sales_amount * 0.10;
        } else if (Sales_amount >= 50000) {
            return Sales_amount * 0.05;
        } else if (Sales_amount >= 30000) {
            return Sales_amount * 0.03;
        } else {
            return 0.0;
        }
}
}