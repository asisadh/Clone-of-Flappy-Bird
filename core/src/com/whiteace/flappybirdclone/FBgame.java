package com.whiteace.flappybirdclone;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;


public class FBgame extends Game {

	@Override
	public void create() {
		Gdx.app.log("FBgame","created");   //log to check object creation.
		setScreen(new GameScreen());
	}
}
