package com.supermario.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by SamuelzXu on 2017-04-29.
 */
public class Level {
    public static SpriteBatch batch;
    public static Texture bg,cbg;
    public static int mapx,mapy;
    public static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    public final int GRAV=-4;

    public Level(int lv, SpriteBatch batch){
        this.batch = batch;
        bg = new Texture("level"+lv+".png");
        cbg = new Texture("clevel"+lv+".png");
        try {
            //read in data file for level
            FileInputStream fis = new FileInputStream("level"+lv+".txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            //read in enemies
            if(br.readLine().equals("ENEMIES")){
                int n = Integer.parseInt(br.readLine());
                for (int i=0;i<n;i++){
                    String[] line = br.readLine().split(",");
                    String e = line[0];
                    if(e.equals("goomba")){//goombas
                        enemies.add(new Goomba(new Coord(line[1],line[2]),Enemy.GOOMBA,batch));
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void update(){

    }

    public void draw(){
        drawEnemies();
        drawMap();
    }

    private void drawEnemies(){
        for (Enemy e:enemies){

        }
    }

    private void drawMap(){

    }
}
