package com.saicharan.assignment.employees;


	public class Developer extends Employee {
	    private String programmingLanguage;

	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    // Getter and Setter for programmingLanguage
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Programming Language: " + programmingLanguage);
	    }
	}


