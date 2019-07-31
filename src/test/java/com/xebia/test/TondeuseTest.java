package com.xebia.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TondeuseTest {

    @DisplayName("La tondeuse doit avancer lorsqu'elle est en position initiale et en direction N")
    @Test
    void testAvancerTondeuseLorsquePositionInitialeEtDirectionNord(){
        char[] commande = {'A'};

        Tondeuse tondeuse = new Tondeuse(0,0, 'N');
        tondeuse.avancer(commande);

        assertEquals(0, tondeuse.getX());
        assertEquals(1, tondeuse.getY());
        assertEquals('N', tondeuse.getDirection());
    }

    @DisplayName("La tondeuse doit avancer lorsqu'elle est en position initiale et en direction S")
    @Test
    void testAvancerTondeuseLorsquePositionInitialeEtDirectionSud(){
        char[] commande = {'A'};

        Tondeuse tondeuse = new Tondeuse(0,0, 'S');
        tondeuse.avancer(commande);

        assertEquals(0, tondeuse.getX());
        assertEquals(-1, tondeuse.getY());
        assertEquals('S', tondeuse.getDirection());
    }


}
