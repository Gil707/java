package ru.gil;

import java.util.Comparator;

public class SortedByAll implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        int k = o1.getQuantity()-o2.getQuantity();

        if (k == 0) {
            k = (int) Math.signum(o1.getPrice() - o2.getPrice());
            if ( k == 0) {
                k = (o1.getName().compareTo(o2.getName()));
            }
        }
        return k;
    }
}
