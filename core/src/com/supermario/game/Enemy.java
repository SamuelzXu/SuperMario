package com.supermario.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by SamuelzXu on 2017-04-29.
 */
public class Enemy {
    Coord c;
    SpriteBatch batch;
    private static int dir;
    public static final int GOOMBA=0;
    private static Texture tx;

    public Enemy(Coord c, int type, SpriteBatch batch){
        this.batch = batch;
        this.c=c;
        tx=new Texture(type+".jpg");
    }
    public void draw(){
        batch.draw(tx,c.getX(),c.getY());
    }
}
