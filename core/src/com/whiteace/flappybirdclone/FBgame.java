package com.whiteace.flappybirdclone;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.whiteace.flappybirdclone.screen.GameScreen;
import com.whiteace.flappybirdclone.zbhelper.AssetLoader;


public class FBgame extends Game {

	@Override
	public void create() {
		Gdx.app.log("FBgame","created");   	//log to check object creation.
		AssetLoader.load();					//load assets of the game before starting the game	
		setScreen(new GameScreen());
	}
	
	@Override
	public void dispose(){
		super.dispose();
		AssetLoader.dispose();
	}
}
