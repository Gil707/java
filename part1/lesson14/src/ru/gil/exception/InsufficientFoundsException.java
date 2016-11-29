package ru.gil.exception;

/**
 * Created by Gil on 25-Nov-16.
 */
public class InsufficientFoundsException extends Exception {

    private double amount;

    public InsufficientFoundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
