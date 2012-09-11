package com.fs.starfarer.api.combat;

public interface FogOfWarAPI {

	public int getPlayerId();
	public void revealAroundPoint(float x, float y, float radius);
}
