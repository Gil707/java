package ru.gil;

import ru.gil.product.Camera;
import ru.gil.product.Phone;
import ru.gil.product.Product;
import ru.gil.product.Type;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Camera cam1 = new Camera("Panasonic VT2");
        cam1.setPrice(500.55);
        cam1.setAmount(20);
        cam1.setType(Type.CAMERA);

        Phone phone1 = new Phone("Motorola RZR V3", 2);
        phone1.setPrice(199.40);
        phone1.setAmount(80);
        phone1.setType(Type.PHONE);

        List<Product> products = new ArrayList<>();

        products.add(phone1);
        products.add(cam1);

        products.forEach(System.out::println);


    }
}
