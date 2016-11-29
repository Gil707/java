package ru.gil;

import ru.gil.A;
import ru.gil.exception.Level1Exception;
import ru.gil.exception.Level2Exception;

/**
 * Created by Gil on 25-Nov-16.
 */
public class B extends A {

    @Override
    void f() throws Level2Exception {
        System.out.println(B.class.getName() + " f()");
        throw new Level2Exception();
    }
}
