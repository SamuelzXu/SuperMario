package com.supermario.game;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.*;

/**
 * Created by SamuelzXu on 2017-04-29.
 */
public class Game {
    private static Level level;
    private static SpriteBatch batch;
    private static Player player;
    public Game(SpriteBatch batch){
        startLevel(1);
        this.batch = batch;
        player = new Player();
    }
    public void update(){
        level.update();
    }
    public void render(){
        level.draw();
    }
    public void startLevel(int lv){
        level = new Level(lv,batch);
    }
    public void movePlayer(int dir){
        player.move(dir);
    }
    public void jumpPlayer(){
        player.jump();
    }

}
