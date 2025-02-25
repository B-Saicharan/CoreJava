package com.tnsif.multithreading;

class Eclips implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Eclip " + Thread.currentThread().getId());
        }
    }
}

class Flipkarts implements Runnable {

    public void run() {
        System.out.println("Flipkart " + Thread.currentThread().getId());
    }
}

public class Mainexample1 {
    public static void main(String[] args) {
        Eclips e = new Eclips();
        Thread obj = new Thread(e);
        obj.setPriority(Thread.MAX_PRIORITY); // Set priority before starting
        obj.start();

        Flipkarts f = new Flipkarts();
        Thread obj1 = new Thread(f);
        obj1.setPriority(Thread.MIN_PRIORITY); // Set priority before starting
        obj1.start();

        // This will print the main method thread's ID
        for (int i = 0; i < 5; i++) {
            System.out.println("mainmethod " + Thread.currentThread().getId());
        }
    }
}
