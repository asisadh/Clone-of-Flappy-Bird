package com.whiteace.flappybirdclone.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

public class GameWorld {
	
	private Rectangle rect = new Rectangle(0, 0, 17, 12);
	
	public GameWorld(){
		Gdx.app.log("GameWorld","Object Created");
		
	}
	
	public Rectangle getRect(){
		return rect;
	}
	
	public void update(float delta){
		Gdx.app.log("GameRenderer","update function was called");
		
		rect.x--;
        if (rect.x < 0) {
            rect.x = 137;
        }
	}

}
