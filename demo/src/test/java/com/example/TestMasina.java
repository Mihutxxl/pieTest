package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestMasina {
    @Test
    public void testCalculeazaAriaTotala() throws PreaMulteRoti {
        Masina masina = new Masina("BMW");

        masina.adaugaRoata(new Roata(10));
        masina.adaugaRoata(new Roata(10));
        masina.adaugaRoata(new Roata(10));
        masina.adaugaRoata(new Roata(10));

        double arieTotala = masina.calculeazaArieTotala();
        double arieOroata = 3.14*3.14*10;

        assertEquals(4 * arieOroata, arieTotala , 0.0001);
    }
    
}
