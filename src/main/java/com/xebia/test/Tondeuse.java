package com.xebia.test;

import com.xebia.test.command.Avancer;
import com.xebia.test.command.Command;
import com.xebia.test.command.Droite;
import com.xebia.test.command.Gauche;

import java.util.HashMap;
import java.util.Map;

public class Tondeuse {

    private PositionTondeuse positionTondeuse;
    private Map<Character, Command> commands;

    public Tondeuse(int x, int y, char direction) {
        this.positionTondeuse = new PositionTondeuse(x, y, direction);
        this.commands = new HashMap<>();
        this.commands.put('A', new Avancer());
        this.commands.put('D', new Droite());
        this.commands.put('G', new Gauche());
    }

    public PositionTondeuse getPositionTondeuse(){
        return this.positionTondeuse;
    }

    public void avancer(char[] commande) {
        for(char cmd: commande){
            this.commands.get(cmd).avancer(positionTondeuse);

            }
        }

    }
