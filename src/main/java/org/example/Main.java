package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal initialValue = new BigDecimal("1900");
        BigDecimal discount = new BigDecimal("10.0");
        Manager manager = new Manager("João");
        Storage storage = new Storage("Camiseta", initialValue, discount);

        storage.attach(manager);
        storage.setPrice(initialValue);
    }
}