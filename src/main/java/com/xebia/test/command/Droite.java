package com.xebia.test.command;

import com.xebia.test.PositionTondeuse;
import com.xebia.test.strategy.Pivoter;

import java.util.HashMap;
import java.util.Map;

public class Droite implements Command {

    private Map<Character, Pivoter> pivoterStrategy;

    public Droite() {
        this.pivoterStrategy = new HashMap<>();
        this.pivoterStrategy.put('N', Pivoter.TO_EAST);
        this.pivoterStrategy.put('E', Pivoter.TO_SOUTH);
        this.pivoterStrategy.put('S', Pivoter.TO_WEST);
        this.pivoterStrategy.put('W', Pivoter.TO_NORTH);

    }

    @Override
    public void avancer(PositionTondeuse position) {
        position.setDirection(this.pivoterStrategy.get(position.getDirection()).pivoter());
    }
}
