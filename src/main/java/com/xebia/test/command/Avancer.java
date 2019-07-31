package com.xebia.test.command;

import com.xebia.test.PositionTondeuse;
import com.xebia.test.strategy.AvancerStrategy;

import java.util.HashMap;
import java.util.Map;

public class Avancer implements Command {

    private Map<Character, AvancerStrategy> incrementStrategies;

    public Avancer() {
        this.incrementStrategies = new HashMap<>();
        this.incrementStrategies.put('N', AvancerStrategy.AVANCER_Y);
        this.incrementStrategies.put('S', AvancerStrategy.RECULER_Y);
        this.incrementStrategies.put('E', AvancerStrategy.AVANCER_X);
        this.incrementStrategies.put('W', AvancerStrategy.RECULER_X);
    }

    @Override
    public void avancer(PositionTondeuse position) {
        this.incrementStrategies.get(position.getDirection()).incrementer(position);
    }
}
