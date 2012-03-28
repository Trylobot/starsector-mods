package com.fs.starfarer.api.campaign;

import java.awt.Color;

import org.lwjgl.util.vector.Vector2f;

public interface StarSystemAPI extends LocationAPI {

	Vector2f getLocation();

	String getName();
	void setName(String name);
	
	SectorEntityToken initStar(String type, Color color, float radius);
	SectorEntityToken addPlanet(SectorEntityToken focus, String name, String type,
								float angle, float radius, float orbitRadius, float orbitDays);
	void addAsteroidBelt(SectorEntityToken focus, int numAsteroids, float orbitRadius, float width, float minOrbitDays, float maxOrbitDays);
	
	SectorEntityToken addOrbitalStation(SectorEntityToken focus,
										float angle, float orbitRadius, float orbitDays,
										String name, String factionId);
	
	SectorEntityToken getStar();
	SectorEntityToken getEntityByName(String name);
}
