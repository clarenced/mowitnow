package com.xebia.test.strategy;

import com.xebia.test.PositionTondeuse;

@FunctionalInterface
public interface AvancerStrategy {


    void incrementer(PositionTondeuse positionTondeuse);

    AvancerStrategy AVANCER_X = positionTondeuse -> positionTondeuse.setX(positionTondeuse.getX() + 1);
    AvancerStrategy AVANCER_Y = positionTondeuse -> positionTondeuse.setY(positionTondeuse.getY() + 1);
    AvancerStrategy RECULER_X = positionTondeuse -> positionTondeuse.setX(positionTondeuse.getX() - 1);
    AvancerStrategy RECULER_Y = positionTondeuse -> positionTondeuse.setY(positionTondeuse.getY() - 1);

}
