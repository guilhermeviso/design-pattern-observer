package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private String product;
    private BigDecimal price;
    private BigDecimal discount;
    private List<Observer> observers = new ArrayList<Observer>();


    public Storage(){}

    public Storage(String product, BigDecimal price, BigDecimal discount){
        this.product = product;
        this.price = price;
        this.discount = discount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
        notifyObserver();
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }
}
