package com;
import java.util.List;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class InventoryTest {
    @Test
    public void addPhone() throws Exception {
        List <Phone> phones= new LinkedList<>();
        Inventory inventory = new Inventory();
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", false, "USA"));
        inventory.addPhone(iphone.getSerialNumber(), iphone.getPrice(), iphone.getSpecs());
        phones.add(iphone);
        assertEquals(inventory.getPhones(), phones);

    }

    @Test
    public void getPhone() throws Exception {
        Inventory inventory = new Inventory();
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", false, "USA"));
        inventory.addPhone(iphone.getSerialNumber(), iphone.getPrice(), iphone.getSpecs());
        Phone iphone_2 = inventory.getPhone(1111);
        assertEquals(iphone_2, iphone);
    }

    @Test
    public void search() throws Exception {
        List <Phone> phones= new LinkedList<>();
        Inventory inventory = new Inventory();
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", false, "USA"));
        inventory.addPhone(iphone.getSerialNumber(), iphone.getPrice(), iphone.getSpecs());
        phones.add(iphone);
        List iphone_2 = inventory.search(iphone);
        assertEquals(iphone_2, phones);
    }
}