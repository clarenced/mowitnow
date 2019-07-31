package com.xebia.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    @DisplayName("Le contenu du fichier ne doit pas être vide")
    @Test
    void testContenuFichierNeDoitPasEtreVide(){
        assertThrows(IllegalArgumentException.class, () -> new MowItNow(""));
    }

    @DisplayName("La position initiale de la premiere tondeuse doit être (1,2,N)")
    @Test
    void testPositionInitialePremiereTondeuse(){

        List<Tondeuse> tondeuses = mowItNow.getTondeuses();
        Tondeuse tondeuse = tondeuses.get(0);
        assertEquals(1, tondeuse.getX());
        assertEquals(2, tondeuse.getY());
        assertEquals('N', tondeuse.getDirection());
    }

}