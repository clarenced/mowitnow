package com.xebia.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TondeuseTest {

    @DisplayName("Doit avancer la tondeuse lorsqu'elle reçoit la commande A")
    @ParameterizedTest(name = "{index} - Commande {1} => actual : {0}, expected : ({2},{3},{4})")
    @MethodSource("avancerArguments")
    void testAvancerTondeuse(Tondeuse tondeuse, char[] commande, int xExpected, int yExpected, char directionExpected){
        tondeuse.avancer(commande);

        assertEquals(xExpected, tondeuse.getX());
        assertEquals(yExpected, tondeuse.getY());
        assertEquals(directionExpected, tondeuse.getDirection());
    }

    static Stream<Arguments> avancerArguments(){
        return Stream.of(
                Arguments.of(new Tondeuse(0,0, 'N'), "A".toCharArray(),0, 1, 'N'),
                Arguments.of(new Tondeuse(0,0, 'S'), "A".toCharArray(), 0, -1, 'S'),
                Arguments.of(new Tondeuse(0,0, 'E'), "A".toCharArray(), 1, 0, 'E'),
                Arguments.of(new Tondeuse(0,0, 'W'), "A".toCharArray(), -1, 0, 'W')
        );
    }
}
