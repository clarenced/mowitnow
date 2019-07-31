package com.xebia.test.strategy;

import com.xebia.test.PositionTondeuse;

@FunctionalInterface
public interface Increment {


    void incrementer(PositionTondeuse positionTondeuse);

    Increment INCREMENT_X = (positionTondeuse -> positionTondeuse.setX(positionTondeuse.getX() + 1));
    Increment INCREMENT_Y = (positionTondeuse -> positionTondeuse.setY(positionTondeuse.getY() + 1));

}
