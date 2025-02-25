package com.saicharan.assignment;

import com.saicharan.assignment.employees.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 75000, "IT");
        Developer developer = new Developer("Bob", 102, 65000, "Java");

        System.out.println("Manager Details:");
        manager.displayInfo();

        System.out.println("\nDeveloper Details:");
        developer.displayInfo();
    }
}
