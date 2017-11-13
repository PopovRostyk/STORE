package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneTest {
    private Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", "false", "USA"));
    @Test
    public void getSerialNumber() throws Exception {
        assertEquals(1111, iphone.getSerialNumber(), 0.1);
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(45, iphone.getPrice(), 0.1);
    }

    @Test
    public void setPrice() throws Exception {
        int price = 10;
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", "false", "USA"));
        iphone.setPrice(price);
        assertEquals(price, iphone.getPrice(), 0.1);
    }

    @Test
    public void getSpecs() throws Exception {
        Spec spec = new Spec(Type.SENSOR, "10", "false", "USA");
        assertEquals(spec.getCountry(), iphone.getSpecs().getCountry());
        assertEquals(spec.getType(), iphone.getSpecs().getType());
        assertEquals(spec.getModel(), iphone.getSpecs().getModel());
        assertEquals(spec.getUsed(), iphone.getSpecs().getUsed());
    }
}