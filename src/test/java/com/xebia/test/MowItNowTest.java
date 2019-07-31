package com.xebia.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MowItNowTest {


    @DisplayName("Première ligne fichier correspond à la dimension de la pelouse")
    @Test
    void testPremiereLigneDuFichierContientDimensionPelouse(){
        String input = "5 5\n" +
                "1 2 N\n" +
                "GAGAGAGAA\n" +
                "3 3 E\n" +
                "AADAADADDA";

        MowItNow mowItNow = new MowItNow(input);
        Pelouse pelouse = mowItNow.getPelouse();
        assertEquals(5, pelouse.getDimX());
        assertEquals(5, pelouse.getDimY());
    }


    @DisplayName("Contenu du fichier contient 2 tondeuses")
    @Test
    void testContenuFichierContient2Tondeuses(){

        String input = "5 5\n" +
                "1 2 N\n" +
                "GAGAGAGAA\n" +
                "3 3 E\n" +
                "AADAADADDA";

        MowItNow mowItNow = new MowItNow(input);
        int nombreTondeuse = mowItNow.getNombreTondeuse();
        assertEquals(2, nombreTondeuse);
    }

}
