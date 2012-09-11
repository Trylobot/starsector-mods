package com.fs.starfarer.api.combat;

import org.lwjgl.util.vector.Vector2f;

public interface ShipAPI {

	Vector2f getLocation();
	Vector2f getVelocity();
	int getOwner();
	MutableShipStatsAPI getMutableStats();
}
