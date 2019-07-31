package com.xebia.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MowItNow {

    private Pelouse pelouse;
    private List<Tondeuse> tondeuses;

    public MowItNow(String input){
        checkInput(input);

        String[] parameters = input.split("\n");
        creerPelouse(parameters[0]);
        creerTondeuses(parameters);

    }

    private void creerTondeuses(String[] parameters) {
        tondeuses = new ArrayList<>();
        for(int i = 1; i < parameters.length; i = i + 2){
            String[] positionTondeuse = parameters[i].split(" ");
            int x = Integer.parseInt(positionTondeuse[0]);
            int y = Integer.parseInt(positionTondeuse[1]);
            char direction = positionTondeuse[2].charAt(0);
            tondeuses.add(new Tondeuse(x,y,direction));
        }
    }

    private void checkInput(String input) {
        if(input == null || input.length() == 0){
            throw new IllegalArgumentException();
        }
    }

    private void creerPelouse(String parameter) {
        String[] dimensionPelouse = parameter.split(" ");
        int dimX = Integer.parseInt(dimensionPelouse[0]);
        int dimY = Integer.parseInt(dimensionPelouse[1]);
        this.pelouse = new Pelouse(dimX, dimY);
    }

    public Pelouse getPelouse() {
        return this.pelouse;
    }

    public int getNombreTondeuse() {
        return this.tondeuses.size();
    }

    public List<Tondeuse> getTondeuses() {
        return this.tondeuses;
    }
}

