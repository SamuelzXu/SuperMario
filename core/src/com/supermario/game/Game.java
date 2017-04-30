package com.supermario.game;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.*;

/**
 * Created by SamuelzXu on 2017-04-29.
 */
public class Game {
    public static Level level;
    public static SpriteBatch batch;
    public Game(SpriteBatch batch){
        startLevel(1);
        this.batch = batch;
    }
    public void render(){
        level.draw();
    }
    public void startLevel(int lv){
        level = new Level(lv,batch);
    }
}
