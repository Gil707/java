package ru.gil;

import ru.gil.exception.Level2Exception;
import ru.gil.exception.Level3Exception;

/**
 * Created by Gil on 25-Nov-16.
 */
public class C extends B {

    @Override
    void f() throws Level2Exception {
        System.out.println(C.class.getName() + " -> f()");
        throw new Level3Exception();
    }
}
