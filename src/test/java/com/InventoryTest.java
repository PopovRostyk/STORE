package com;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class InventoryTest {
    @Test
    public void addPhone() throws Exception {
        List <Phone> phones= new LinkedList<>();
        Inventory inventory = new Inventory();
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", "false", "USA"));
        inventory.addPhone(iphone.getSerialNumber(), iphone.getPrice(), iphone.getSpecs());
        phones.add(iphone);
        for (Iterator phoneIterator = inventory.getPhones().iterator();
                phoneIterator.hasNext();){
            Phone phone = (Phone) phoneIterator.next();
        }
    }

    @Test
    public void getPhone() throws Exception {
        Inventory inventory = new Inventory();
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", "false", "USA"));
        inventory.addPhone(iphone.getSerialNumber(), iphone.getPrice(), iphone.getSpecs());
        Phone iphone_2 = inventory.getPhone(1111);
        assertEquals(iphone_2.getSpecs().getCountry(), iphone.getSpecs().getCountry());
        assertEquals(iphone_2.getSpecs().getType(), iphone.getSpecs().getType());
        assertEquals(iphone_2.getSpecs().getModel(), iphone.getSpecs().getModel());
        assertEquals(iphone_2.getSpecs().getUsed(), iphone.getSpecs().getUsed());
    }

    @Test
    public void search() throws Exception {
        List <Phone> phones= new LinkedList<>();
        Inventory inventory = new Inventory();
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", "false", "USA"));
        inventory.addPhone(iphone.getSerialNumber(), iphone.getPrice(), iphone.getSpecs());
        phones.add(iphone);
        List iphone_2 = inventory.search(iphone);
        Phone phoneNew = (Phone) iphone_2.get(0);
        assertEquals(phoneNew.getSpecs().getUsed(), iphone.getSpecs().getUsed());
        assertEquals(phoneNew.getSpecs().getModel(), iphone.getSpecs().getModel());
        assertEquals(phoneNew.getSpecs().getType(), iphone.getSpecs().getType());
        assertEquals(phoneNew.getSpecs().getCountry(), iphone.getSpecs().getCountry());
    }
}