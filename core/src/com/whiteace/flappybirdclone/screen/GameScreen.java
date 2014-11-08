package com.whiteace.flappybirdclone.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.whiteace.flappybirdclone.gameworld.GameRenderer;
import com.whiteace.flappybirdclone.gameworld.GameWorld;
import com.whiteace.flappybirdclone.zbhelper.InputHandler;

public class GameScreen implements Screen{
	
	private GameWorld world;
	private GameRenderer renderer;
	private float runTime = 0;

	public GameScreen(){
		Gdx.app.log("GameScreen","Object Created");
		

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);
		
		world = new GameWorld(midPointY); 			// initialize world
		renderer = new GameRenderer(world,(int) gameHeight,midPointY); 		// initialize renderer
		Gdx.input.setInputProcessor(new InputHandler(world));
	}
	
	@Override
	public void render(float delta) {
		runTime += delta;
		world.update(delta);
		renderer.render(runTime);
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
