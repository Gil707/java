package ru.gil;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    static <T> void addAll(T[] a, Collection<T> c) {
        for (int i = 0; i < a.length; i++) {
            c.add(a[i]);
        }
    }

    public static void main(String[] args) {
        addAll(new String[10], new ArrayList<String>());
        addAll(new Object[10], new ArrayList<Object>());
        addAll(new Object[10], new ArrayList<String>());
        addAll(new String[10], new ArrayList<Object>());
    }

}
