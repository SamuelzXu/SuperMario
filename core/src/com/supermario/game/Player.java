package com.supermario.game;

/**
 * Created by SamuelzXu on 2017-04-30.
 */
public class Player {
    private int posx,posy,vx,vy;
    public static final int LEFT=-3,RIGHT=3;
    public Player(){
        posx=0;posy=0;
    }
    public void move(int dir){
        vx=dir;
    }
    public void jump(){
        vy+=4;
    }
    public void update(){
        posy+=vy;
        posx+=vx;
    }
}
