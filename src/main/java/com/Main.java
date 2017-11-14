package com;

public class Main {
    public static void main(String[] args) {
        int priceNew = 45;
        int serialNewnumber = 1111;
        Inventory phoneStore = new Inventory();
        Phone iphone = new Phone(serialNewnumber, priceNew,
                new Spec(Type.SENSOR, "10", "false", "USA"));
        Phone phone = new Phone(serialNewnumber, priceNew,
                new Spec(Type.SENSOR, "10", "false", "UA"));
        Phone samsung = new Phone(serialNewnumber, priceNew,
                new Spec(Type.SENSOR, "s6", "false", "GB"));
        phoneStore.addPhone(iphone.getSerialNumber(), iphone.getPrice(),
                iphone.getSpecs());
        phoneStore.addPhone(phone.getSerialNumber(), phone.getPrice(),
                phone.getSpecs());
        phoneStore.addPhone(samsung.getSerialNumber(), samsung.getPrice(),
                samsung.getSpecs());
        System.out.println(iphone.getSpecs());



    }
}
