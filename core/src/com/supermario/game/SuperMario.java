package com.supermario.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SuperMario extends ApplicationAdapter {
	SpriteBatch batch;
    public static Game game;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		game = new Game(batch);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
        game.render();
		batch.end();
	}
	public void takeInput(){

    }
	@Override
	public void dispose () {
		batch.dispose();
	}
}
