package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecTest {
    @Test
    public void testtoString() throws Exception {
        int priceNew = 45;
        int serialNewnumber = 1111;
        String msg = "Spec{type=Sensor, model='10', used=false, country='USA'}";
        Spec specs = new Spec(Type.SENSOR, "10", "false", "USA");
        assertEquals(msg, specs.toString());
    }

    private Spec specs = new Spec(Type.SENSOR, "5s", "false", "USA");

    @Test
    public void getType() throws Exception {
        assertEquals(Type.SENSOR, specs.getType());
    }

    @Test
    public void getModel() throws Exception {
        assertEquals("5s", specs.getModel());
    }

    @Test
    public void getUsed() throws Exception {
        assertEquals("false", specs.getUsed());
    }

    @Test
    public void getCountry() throws Exception {
        assertEquals("USA", specs.getCountry());
    }
}