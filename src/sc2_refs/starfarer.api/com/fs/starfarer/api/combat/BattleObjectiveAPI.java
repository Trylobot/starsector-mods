package com.fs.starfarer.api.combat;

import org.lwjgl.util.vector.Vector2f;

public interface BattleObjectiveAPI {
	public static enum Importance {
		//MINOR,
		//IMPORTANT,
		//CRITICAL,
		NORMAL,
	}
	
	
	public Vector2f getLocation();
	public int getOwner();
	public String getType();
	public Importance getImportance();
	public String getDisplayName();
}
