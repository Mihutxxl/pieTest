package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestRoata {

    @Test
    public void testCalculeazaAria() {
        Roata roata = new Roata(10);
        double aria = roata.calculeazaArie();

        assertEquals(3.14*3.14*10, aria, 0.0001);
    }
}