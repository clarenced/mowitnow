package com.xebia.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MowItNowTest {

    private final String input = "5 5\n1 2 N\nGAGAGAGAA\n3 3 E\nAADAADADDA";

    private MowItNow mowItNow;


    @BeforeEach
    void setUp(){
        mowItNow = new MowItNow(input);
    }


    @DisplayName("Première ligne fichier correspond à la dimension de la pelouse")
    @Test
    void testPremiereLigneDuFichierContientDimensionPelouse(){

        Pelouse pelouse = mowItNow.getPelouse();
        assertEquals(5, pelouse.getDimX());
        assertEquals(5, pelouse.getDimY());
    }


    @DisplayName("Contenu du fichier contient 2 tondeuses")
    @Test
    void testContenuFichierContient2Tondeuses(){
        int nombreTondeuse = mowItNow.getNombreTondeuse();
        assertEquals(2, nombreTondeuse);
    }

}
