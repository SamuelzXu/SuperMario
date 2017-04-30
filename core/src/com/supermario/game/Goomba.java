package com.supermario.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by SamuelzXu on 2017-04-29.
 */
public class Goomba extends Enemy {
    Goomba(Coord c, int type, SpriteBatch batch){
        super(c,type,batch);
        vx=2;
    }

    @Override
    public void update(){
        posx+=vx;
        posy+=vy;
    }
}
