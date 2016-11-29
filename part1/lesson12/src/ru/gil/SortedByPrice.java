package ru.gil;

import java.util.Comparator;

public class SortedByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) Math.signum(o1.getPrice() - o2.getPrice());
    }
}

