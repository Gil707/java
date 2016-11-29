package ru.gil.product;

/**
 * Created by Gil on 27-Nov-16.
 */
public class Camera extends Product {

    String name;


    public Camera(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Camera: " + name + ", price: " + super.getPrice() + ", amount: " + super.getAmount();
    }
}
