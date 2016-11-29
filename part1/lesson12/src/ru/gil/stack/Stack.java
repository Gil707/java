package ru.gil.stack;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private int size;
    private List<T> stackArray;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.stackArray = new ArrayList<T>(size);
        top = -1;
    }

    public void push(T element) {
        stackArray.add(element);
        top++;
    }

    public <T> T peek() {
        return top > -1 ? (T)stackArray.get(top) : null;
    }

    public T pop() {
        T res = null;
        if (top > -1) {
            res = stackArray.get(top);
            stackArray.remove(top);
            top--;
        }
        return res;
    }
}
