package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecTest {
    private Spec specs = new Spec(Type.SENSOR, "5s", false, "USA");

    @Test
    public void getType() throws Exception {
        assertEquals(specs.getType(), Type.SENSOR);
    }

    @Test
    public void getModel() throws Exception {
        assertEquals(specs.getModel(), "5s");
    }

    @Test
    public void getUsed() throws Exception {
        assertEquals(specs.getUsed(), false);
    }

    @Test
    public void getCountry() throws Exception {
        assertEquals(specs.getCountry(), "USA");
    }
}