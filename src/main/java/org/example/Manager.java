package org.example;

import java.math.BigDecimal;

public class Manager implements Observer{
    private String name;

    public Manager(){}

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Storage storage) {
        BigDecimal value = storage.getPrice();
        BigDecimal limit = new BigDecimal("1000.00");
        if(value.compareTo(limit) > 0){
            System.out.println("Manager: "+ name + "\nProduct in stock. Value: " + storage.getPrice() + "\nHigher than 1000.0");
        }
    }
}
