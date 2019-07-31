package com.xebia.test.command;

import com.xebia.test.PositionTondeuse;
import com.xebia.test.strategy.Pivoter;

import java.util.Map;

public class Droite implements Command {

    private Map<Character, Pivoter> pivoterStrategy;

    public Droite() {
    }

    @Override
    public void avancer(PositionTondeuse position) {

    }
}
