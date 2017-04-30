package com.supermario.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SuperMario extends ApplicationAdapter implements InputProcessor {
	SpriteBatch batch;
    public static Game game;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		//Pass the batch along to every class to enable drawing to Spritebatch
		game = new Game(batch);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		takeInput();
		game.update();

		batch.begin();
        game.render();
		batch.end();
	}
	public void takeInput(){
	    if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
	        game.movePlayer(Player.LEFT);
        }else if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            game.movePlayer(Player.RIGHT);
        }else if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            game.jumpPlayer();
        }
    }
	@Override
	public void dispose () {
		batch.dispose();
	}

    public boolean touchDown (int x, int y, int pointer, int button) {return true;}
    public boolean touchDragged(int x, int y, int z){
        return true;
    }

    public boolean keyTyped(char ch){
        return true;
    }

    public boolean keyDown(int num){
        return true;
    }

    public boolean mouseMoved(int x, int y){
        return true;
    }

    public boolean keyUp(int num){
        return true;
    }

    public boolean touchUp(int x,int y,int x2,int y2){
        return true;
    }

    public boolean scrolled(int num){
        return true;
    }
}
