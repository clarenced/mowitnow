package com.xebia.test;

public class Tondeuse {

    private int x;
    private int y;
    private char direction;

    public Tondeuse(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }

    public void avancer(char[] commande) {
        for(char cmd: commande){
            if(cmd == 'A')
                if(direction == 'N')
                    ++this.y;
        }

    }
}
