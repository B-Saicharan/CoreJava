package com.tnsif.bankingtransaction;

public class Bank {
	// Define the Bank clas Static variable to keep track of the total number of bank accounts
	    private static int totalAccounts = 0;

	    // Static method to get the current value of totalAccounts
	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }

	    // Constructor to create a new bank account
	    public Bank() {
	        totalAccounts++;
	    }
	}
