package com;

public class Main {
    public static void main(String[] args) {
        Inventory phoneStore = new Inventory();
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR,
                "10", "false", "USA"));
        Phone phone = new Phone(1111, 45, new Spec(Type.SENSOR,
                "10", "false", "UA"));
        Phone samsung = new Phone(1111, 45, new Spec(Type.SENSOR,
                "s6", "false", "GB"));
        phoneStore.addPhone(iphone.getSerialNumber(), iphone.getPrice(),
                iphone.getSpecs());
        phoneStore.addPhone(phone.getSerialNumber(), phone.getPrice(),
                phone.getSpecs());
        phoneStore.addPhone(samsung.getSerialNumber(), samsung.getPrice(),
                samsung.getSpecs());
        System.out.println(phoneStore);
    }
}
