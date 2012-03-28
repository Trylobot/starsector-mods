package com.fs.starfarer.api.combat;

import org.lwjgl.util.vector.Vector2f;


public interface WeaponAPI {
	public static enum WeaponType {
		ENERGY("Energy"),
		BALLISTIC("Ballistic"),
		MISSILE("Missile"),
		LAUNCH_BAY("Launch Bay"),
		UNIVERSAL("Universal");
		
		private String displayName;
		private WeaponType(String displayName) {
			this.displayName = displayName;
		}
		public String getDisplayName() {
			return displayName;
		}
		
	}
	
	public static enum WeaponSize {
		SMALL("Small"),
		MEDIUM("Medium"),
		LARGE("Large");
		
		private String displayName;
		private WeaponSize(String name) {
			this.displayName = name;
		}
		public String getDisplayName() {
			return displayName;
		}
	}
	
	public static enum AIHints {
		PD,
		USE_VS_FRIGATES,
		STRIKE,
		DO_NOT_AIM,
		ANTI_FTR,
		HEATSEEKER,
	}
	
	
	String getId();
	WeaponType getType();
	WeaponSize getSize();
	
	void setPD(boolean pd);
	
	/**
	 * Returns 0 if the target is in arc, angular distance to edge of arc otherwise.
	 * @param target
	 * @return
	 */
	float distanceFromArc(Vector2f target);
	boolean isAlwaysFire();
	
	float getCurrSpread();
	float getCurrAngle();
	float getRange();
	float getDisplayArcRadius();
	float getChargeLevel();
	float getTurnRate();
	float getProjectileSpeed();
	String getDisplayName();
	int getAmmo();
	int getMaxAmmo();
	void resetAmmo();
	float getCooldownRemaining();
	float getCooldown();
	
	boolean isBeam();
	boolean isPulse();
	boolean requiresFullCharge();
	
	boolean usesAmmo();
	boolean usesEnergy();
	
	boolean hasAIHint(AIHints hint);
	CollisionClass getProjectileCollisionClass();
	
	void beginSelectionFlash();
	float getFluxCostToFire();

	/*
	DamageType getDamageType();
	Damage getDamage();
	*/
}


