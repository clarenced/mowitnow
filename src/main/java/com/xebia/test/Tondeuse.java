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
            if(cmd == 'A'){
                if(direction == 'N')
                    ++this.y;
                else if(direction == 'S')
                    --this.y;
                else if(direction == 'E')
                    ++this.x;
                else if(direction == 'W')
                    --this.x;
            } else if(cmd == 'D'){
                if(direction == 'N')
                    direction = 'E';
                else if(direction == 'E')
                    direction = 'S';
                else if(direction == 'S')
                    direction = 'W';
                else if(direction == 'W')
                    direction = 'N';

            }


        }

    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + direction + ")";
    }
}
