package ru.gil;

import java.util.*;

public class Main {

    static <T extends Comparable<? super T>> T max(Collection<T> c) {
        T max = null;
        Iterator<T> iterator = c.iterator();
        if (iterator.hasNext()) max = iterator.next();

        while (iterator.hasNext()) {
            T tmp = iterator.next();
            if (max.compareTo(tmp) < 0) max = tmp;
        }
        return max;
    }

    static void swap(List<?> list, int i, int j) {
        swapImpl(list, i, j);
    }

    static <T> void swapImpl(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    static class Test implements Comparable<Object> {

        @Override
        public int compareTo(Object o) {
            return 1;
        }
    }

    static <T, M extends T> void copy(Collection<T> t, Collection<M> m) {
        for (Iterator<M> i = m.iterator(); i.hasNext()) {
            M o = i.next();
            t.add(o);
        }
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);

        int max = max(nums);
        System.out.println(max);
    }


//        Product[] products = new Product[3];


//        products[0] = new Product("Milk", 48.65, 10);
//        products[1] = new Product("Coffee", 148.65, 2);
//        products[2] = new Product("Tea", 12.50, 140);


//        for (Product p : products
//                ) {
//            System.out.println(p);
//        }
//        System.out.println();
//
//        Arrays.sort(products, new SortedByName());
//        for (Product p : products
//                ) {
//            System.out.println(p);
//        }
//        System.out.println();
//
//        Arrays.sort(products, new SortedByPrice());
//        for (Product p : products
//                ) {
//            System.out.println(p);
//        }
//        System.out.println();
//
//        Arrays.sort(products, new SortedByQuantity());
//        for (Product p : products
//                ) {
//            System.out.println(p);
//        }
//        System.out.println();
//
//        Arrays.sort(products, new SortedByAll());
//        for (Product p : products
//                ) {
//            System.out.println(p);
//        }
//        System.out.println();
//
//        List<Product> productList = Arrays.asList(products);
//        Collections.sort(productList);
//
//        List<Product> productList2 = Arrays.asList(products);
//        Collections.sort(productList2, new SortedByQuantity());
//
//        Iterator<Product> iter = productList.iterator();
//            while (iter.hasNext()) {
//                System.out.println(iter.next());
//            }
//
//        System.out.println();
//
//        Iterator<Product> iter2 = productList2.iterator();
//        while (iter2.hasNext()) {
//            System.out.println(iter2.next());
//        }
}
