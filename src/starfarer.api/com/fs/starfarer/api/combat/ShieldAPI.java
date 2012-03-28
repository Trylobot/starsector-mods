package com.fs.starfarer.api.combat;


public interface ShieldAPI {
	
	public static enum ShieldType {NONE, FRONT, DIRECTIONAL, OMNI}

	void setType(ShieldType type);
}
