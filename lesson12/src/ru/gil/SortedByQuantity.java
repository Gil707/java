package ru.gil;

import java.util.Comparator;

public class SortedByQuantity implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (o1.getQuantity() - o2.getQuantity());
    }
}
