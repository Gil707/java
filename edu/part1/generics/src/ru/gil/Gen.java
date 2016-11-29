package ru.gil;

/**
 * Created by Gil on 27-Nov-16.
 */
public class Gen<T, U> {

    T obj;
    U obj1;

    public Gen(T o, U o2) {
        obj = o;
        obj1 = o2;
    }

    public T getObj() {
        return obj;
    }

    public U getObj1() {
        return obj1;
    }

    <T> T method(T type) {
        return type;
    }
}
