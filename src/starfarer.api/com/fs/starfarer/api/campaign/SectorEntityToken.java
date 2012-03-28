package com.fs.starfarer.api.campaign;

import org.lwjgl.util.vector.Vector2f;

public interface SectorEntityToken {
	
	CargoAPI getCargo();
	Vector2f getLocation();
	OrbitAPI getOrbit();
	Object getName();
}
