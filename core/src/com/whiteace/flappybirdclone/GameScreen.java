package com.whiteace.flappybirdclone;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.whiteace.flappybirdclone.gameworld.GameRenderer;
import com.whiteace.flappybirdclone.gameworld.GameWorld;

public class GameScreen implements Screen{
	
	private GameWorld world;
	private GameRenderer renderer;

	public GameScreen(){
		Gdx.app.log("GameScreen","Object Created");
		world = new GameWorld(); 			// initialize world
		renderer = new GameRenderer(world); 		// initialize renderer
	}
	
	@Override
	public void render(float delta) {
		world.update(delta);
		renderer.render();
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log("GameScreen","Window resize");
		
	}

	@Override
	public void show() {
		Gdx.app.log("GameScreen","show");
		
	}

	@Override
	public void hide() {
		Gdx.app.log("GameScreen","hide");
		
	}

	@Override
	public void pause() {
		Gdx.app.log("GameScreen","paused");
		
	}

	@Override
	public void resume() {
		Gdx.app.log("GameScreen","resume");
		
	}

	@Override
	public void dispose() {
		Gdx.app.log("GameScreen","dispose");
		
	}

}
