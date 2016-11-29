package ru.gil;


import ru.gil.exception.InsufficientFoundsException;
import ru.gil.exception.Level1Exception;
import ru.gil.exception.TrivialException;
import ru.gil.exception.VeryImportantException;

public class Main {

    public static void main(String[] args) {

        try {
            InputFile in = new InputFile("123.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("f14");

//        A ins = new C();
//
//        try {
//            ins.f();
//        } catch (Level1Exception e) {
//            e.printStackTrace();
//        }

//        CheckingAccount c = new CheckingAccount(101);
//        System.out.println("Depo add 500");
//        c.deposit(500.00);
//
//        try {
//            System.out.println("Withdrowing 100...");
//            c.withdraw(100.00);
//            System.out.println("Withdrowing 600...");
//            c.withdraw(600.00);
//
//        } catch (InsufficientFoundsException e) {
//            System.out.println("Not enought money " + e.getAmount());
//            e.printStackTrace();
//
//        }
    }

    private static void w() {
        int random = (int) (Math.random()*101);
        while (random != 42) {
            try {
                throw new Exception("Random is " + random);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                random = (int) (Math.random()*101);
                System.out.println(random);
            }
       }
    }

//    void f() throws VeryImportantException {
//        throw new VeryImportantException();
//    }
//    void dispose() throws TrivialException {
//        throw new TrivialException();
//    }

}
