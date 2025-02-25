package com.tnsif.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 5000, 5));
        laps.add(new Laptop("Mell", 4000, 53));
        laps.add(new Laptop("Bell", 75000, 4));
        laps.add(new Laptop("Cell", 54000, 15));

        System.out.println("Original List:");
        for (Laptop l : laps) {
            System.out.println(l);
        }

        Collections.sort(laps, new Laptopcomparator());
        System.out.println("\nSorted by Price:");
        for (Laptop l : laps) {
            System.out.println(l);
        }

        Collections.sort(laps, new RamComparator());
        System.out.println("\nSorted by RAM:");
        for (Laptop l : laps) {
            System.out.println(l);
        }

        Collections.sort(laps, new BrandComparator());
        System.out.println("\nSorted by Brand:");
        for (Laptop l : laps) {
            System.out.println(l);
        }
    }
}
