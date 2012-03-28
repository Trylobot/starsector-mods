package com.fs.starfarer.api.combat;

import com.fs.starfarer.api.combat.ShipAPI.HullSize;

public interface HullModEffect {
	void applyEffectsBeforeShipCreation(HullSize hullSize, MutableShipStatsAPI stats, String id);
	void applyEffectsAfterShipCreation(ShipAPI ship, String id);
	String getDescriptionParam(int index, HullSize hullSize);
}
