package com.fs.starfarer.api.combat;

import java.util.List;

import org.lwjgl.util.vector.Vector2f;

public interface ShipAPI {

	public static enum HullSize {
		DEFAULT, // also makes FIGHTER.ordinal() = 1, which is convenient
		FIGHTER,
		FRIGATE,
		DESTROYER,
		CRUISER,
		CAPITAL_SHIP,
	}

	Vector2f getLocation();
	Vector2f getVelocity();
	int getOwner();
	MutableShipStatsAPI getMutableStats();
	
	List<WeaponAPI> getAllWeapons();
	
	ShieldAPI getShield();
	//void setShield(ShieldType type, float arc);
}
