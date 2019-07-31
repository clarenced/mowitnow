package com.xebia.test.strategy;

import com.xebia.test.PositionTondeuse;

@FunctionalInterface
public interface Decrement {

    void decrement(PositionTondeuse positionTondeuse);

    Decrement DECREMENT_X = positionTondeuse -> positionTondeuse.setX(positionTondeuse.getX() - 1);
    Decrement DECREMENT_Y = positionTondeuse -> positionTondeuse.setY(positionTondeuse.getY() - 1);

}
