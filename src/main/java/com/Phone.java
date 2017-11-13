package com;

public class Phone {
    private int serialNumber;
    private double price;
    private Spec specs;
    public Phone(int serialNumber, double price, Spec specs){
        this.serialNumber = serialNumber;
        this.price = price;
        this.specs = specs;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public Spec getSpecs() {
        return specs;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", price=" + price +
                ", specs=" + specs +
                '}';
    }
}