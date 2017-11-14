package com;
import java.util.List;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class InventoryTest {
    @Test
    public void testtoString() throws Exception {
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
        String msg = "Inventory{phones=[Phone{serialNumber=1111, price=45.0, specs=Spec{type=Sensor, model='10', used=false, country='USA'}}, Phone{serialNumber=1111, price=45.0, specs=Spec{type=Sensor, model='10', used=false, country='UA'}}, Phone{serialNumber=1111, price=45.0, specs=Spec{type=Sensor, model='s6', used=false, country='GB'}}]}";
        assertEquals(msg, phoneStore.toString());
    }

    @Test
    public void addPhone() throws Exception {
        List <Phone> phones= new LinkedList<>();
        Inventory inventory = new Inventory();
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", "false", "USA"));
        inventory.addPhone(iphone.getSerialNumber(), iphone.getPrice(), iphone.getSpecs());
        phones.add(iphone);
        Phone phoneTest = (Phone) inventory.getPhones().get(inventory.getPhones().size() - 1);
        assertEquals(phoneTest.getSpecs().getCountry(), iphone.getSpecs().getCountry());
        assertEquals(phoneTest.getSpecs().getType(), iphone.getSpecs().getType());
        assertEquals(phoneTest.getSpecs().getModel(), iphone.getSpecs().getModel());
        assertEquals(phoneTest.getSpecs().getUsed(), iphone.getSpecs().getUsed());
        assertEquals(phoneTest.getSerialNumber(), iphone.getSerialNumber());
        assertEquals(phoneTest.getPrice(), iphone.getPrice(), 0.1);

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