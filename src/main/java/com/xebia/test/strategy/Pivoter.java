package com.xebia.test.strategy;

@FunctionalInterface
public interface Pivoter {

    char pivoter();

    Pivoter TO_EAST   = () -> 'E';
    Pivoter TO_NORTH  = () -> 'N';
    Pivoter TO_SOUTH  = () -> 'S';
    Pivoter TO_WEST   = () -> 'W';
}
