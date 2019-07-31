package com.xebia.test;

public class MowItNow {

    private Pelouse pelouse;
    private int nombreTondeuses;

    public MowItNow(String input){
        String[] parameters = input.split("\n");
        creerPelouse(parameters[0]);
        for(int i = 1; i < parameters.length; i = i + 2){
            nombreTondeuses++;
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
        return nombreTondeuses;
    }
}

