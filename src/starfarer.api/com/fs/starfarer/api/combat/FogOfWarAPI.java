package com.fs.starfarer.api.combat;

public interface FogOfWarAPI {

	public int getPlayerId();
	public void revealAroundPoint(Object source, float x, float y, float radius);
}
