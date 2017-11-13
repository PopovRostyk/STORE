package com;

public class Main {
    public static void main(String[] args) {
        Inventory PhoneStore = new Inventory();
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", false, "USA"));
        Phone phone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", false, "UA"));
        Phone samsung = new Phone(1111, 45, new Spec(Type.SENSOR, "s6", false, "GB"));
        PhoneStore.addPhone(iphone.getSerialNumber(), iphone.getPrice(), iphone.getSpecs());
        PhoneStore.addPhone(phone.getSerialNumber(), phone.getPrice(), phone.getSpecs());
        PhoneStore.addPhone(samsung.getSerialNumber(), samsung.getPrice(), samsung.getSpecs());
        System.out.println(PhoneStore);
    }
}
