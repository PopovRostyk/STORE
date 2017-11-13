package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecTest {
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