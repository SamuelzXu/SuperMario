package com.supermario.game;

/**
 * Created by SamuelzXu on 2017-04-29.
 */
public class Coord {
    int x, y;
    public Coord(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Coord(String x, String y){
        this.x=Integer.parseInt(x);
        this.y=Integer.parseInt(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
