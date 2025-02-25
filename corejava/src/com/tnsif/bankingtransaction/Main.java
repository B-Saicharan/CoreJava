package com.tnsif.bankingtransaction;


public class Main {
    public static void main(String[] args) {
        // Create new bank accounts
        Bank account1 = new Bank();
        Bank account2 = new Bank();
        Bank account3 = new Bank();

        // Get the total number of bank accounts
        int total = Bank.getTotalAccounts();
        System.out.println("Total Bank Accounts: " + total); // Should print: Total Bank Accounts: 3
    }
}
