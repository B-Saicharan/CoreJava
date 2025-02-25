package com.tnsif.comparatordemo;

import java.util.Comparator;

public class RamComparator implements Comparator<Laptop> {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        return Integer.compare(o1.getRam(), o2.getRam());
    }
}

