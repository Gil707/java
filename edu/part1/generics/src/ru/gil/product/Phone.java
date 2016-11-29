package ru.gil.product;

/**
 * Created by Gil on 27-Nov-16.
 */
public class Phone extends Product {

    String name;
    int simAmount;

    public Phone(String name, Integer simAmount) {
        this.name = name;
        this.simAmount = simAmount;
    }

    @Override
    public String toString() {
        return "Phone: " + name + ", price: " + super.getPrice() + ", amount: " + super.getAmount() + ", sim: " + simAmount;
    }


}
