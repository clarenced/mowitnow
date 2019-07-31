package com.xebia.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TondeuseTest {

    @DisplayName("La tondeuse doit avancer lorsqu'elle reçoit la commande A")
    @ParameterizedTest(name = "{index} - Commande {1} => actual : {0}, expected : ({2},{3},{4})")
    @MethodSource("avancerArguments")
    void testAvancerTondeuse(Tondeuse tondeuse, char[] commande, int xExpected, int yExpected, char directionExpected){
        tondeuse.avancer(commande);

        assertEquals(xExpected, tondeuse.getPositionTondeuse().getX());
        assertEquals(yExpected, tondeuse.getPositionTondeuse().getY());
        assertEquals(directionExpected, tondeuse.getPositionTondeuse().getDirection());
    }

    static Stream<Arguments> avancerArguments(){
        return Stream.of(
                Arguments.of(new Tondeuse(0,0, 'N'), "A".toCharArray(),0, 1, 'N'),
                Arguments.of(new Tondeuse(0,0, 'S'), "A".toCharArray(), 0, -1, 'S'),
                Arguments.of(new Tondeuse(0,0, 'E'), "A".toCharArray(), 1, 0, 'E'),
                Arguments.of(new Tondeuse(0,0, 'W'), "A".toCharArray(), -1, 0, 'W')
        );
    }

    @DisplayName("La tondeuse doit pivoter à droite lorsqu'elle reçoit la commande D")
    @ParameterizedTest(name = "{index} - Commande {1} => actual : {0}, expected : ({2},{3},{4})")
    @MethodSource("pivoterDroiteArguments")
    void testPivoterDroiteTondeuse(Tondeuse tondeuse, char[] commande, int xExpected, int yExpected, char directionExpected){
        tondeuse.avancer(commande);

        assertEquals(xExpected, tondeuse.getPositionTondeuse().getX());
        assertEquals(yExpected, tondeuse.getPositionTondeuse().getY());
        assertEquals(directionExpected, tondeuse.getPositionTondeuse().getDirection());
    }

    static Stream<Arguments> pivoterDroiteArguments(){
        return Stream.of(
                Arguments.of(new Tondeuse(0,0, 'N'), "D".toCharArray(),0, 0, 'E'),
                Arguments.of(new Tondeuse(0,0, 'S'), "D".toCharArray(), 0, 0, 'W'),
                Arguments.of(new Tondeuse(0,0, 'E'), "D".toCharArray(), 0, 0, 'S'),
                Arguments.of(new Tondeuse(0,0, 'W'), "D".toCharArray(), 0, 0, 'N')
        );
    }

    @DisplayName("La tondeuse doit pivoter à gauche lorsqu'elle reçoit la commande G")
    @ParameterizedTest(name = "{index} - Commande {1} => actual : {0}, expected : ({2},{3},{4})")
    @MethodSource("pivoterGaucheArguments")
    void testPivoterGaucheTondeuse(Tondeuse tondeuse, char[] commande, int xExpected, int yExpected, char directionExpected){
        tondeuse.avancer(commande);

        assertEquals(xExpected, tondeuse.getPositionTondeuse().getX());
        assertEquals(yExpected, tondeuse.getPositionTondeuse().getY());
        assertEquals(directionExpected, tondeuse.getPositionTondeuse().getDirection());
    }

    static Stream<Arguments> pivoterGaucheArguments(){
        return Stream.of(
                Arguments.of(new Tondeuse(0,0, 'N'), "G".toCharArray(),0, 0, 'W'),
                Arguments.of(new Tondeuse(0,0, 'S'), "G".toCharArray(), 0, 0, 'E'),
                Arguments.of(new Tondeuse(0,0, 'E'), "G".toCharArray(), 0, 0, 'N'),
                Arguments.of(new Tondeuse(0,0, 'W'), "G".toCharArray(), 0, 0, 'S')
        );
    }

    @DisplayName("La tondeuse doit être capable d'avancer et de pivoter lorsqu'elle reçoit plusieurs commandes")
    @ParameterizedTest(name = "{index} - Commande {1} => actual : {0}, expected : ({2},{3},{4})")
    @MethodSource("pivoterEtAvancerTondeuseArguments")
    void testPivoterEtAvancerTondeuse(Tondeuse tondeuse, char[] commande, int xExpected, int yExpected, char directionExpected){
        tondeuse.avancer(commande);

        assertEquals(xExpected, tondeuse.getPositionTondeuse().getX());
        assertEquals(yExpected, tondeuse.getPositionTondeuse().getY());
        assertEquals(directionExpected, tondeuse.getPositionTondeuse().getDirection());
    }

    static Stream<Arguments> pivoterEtAvancerTondeuseArguments() {
        return Stream.of(
                Arguments.of(new Tondeuse(0, 0, 'N'), "AADADGAGA".toCharArray(), 2, 3, 'N')
                );
    }
}
