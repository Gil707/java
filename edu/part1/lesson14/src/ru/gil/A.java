package ru.gil;

import ru.gil.exception.Level1Exception;

/**
 * Created by Gil on 25-Nov-16.
 */
public class A {

    void f() throws Level1Exception {
        System.out.println(A.class.getName() + " f()");
        throw new Level1Exception();
    }
}
