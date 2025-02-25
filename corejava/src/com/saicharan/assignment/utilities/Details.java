package com.saicharan.assignment.utilities;

import java.util.Scanner;

public class Details {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter Full Name: ");
	        String fullName = scanner.nextLine();
	        
	        System.out.print("Enter Roll Number: ");
	        String rollNumber = scanner.nextLine();
	        
	        System.out.print("Enter Grade: ");
	        String grade = scanner.nextLine();
	        
	        System.out.print("Enter Percentage: ");
	        String percentage = scanner.nextLine();
	        
	        System.out.println("\nStudent Details:");
	        System.out.println(fullName);
	        System.out.println(rollNumber);
	        System.out.println(grade);
	        System.out.println(percentage);
	        
	        scanner.close();
	    }
	}


