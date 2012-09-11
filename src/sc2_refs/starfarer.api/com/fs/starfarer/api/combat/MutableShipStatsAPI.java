package com.fs.starfarer.api.combat;


public interface MutableShipStatsAPI {
	public MutableStat getMaxSpeed();
	public MutableStat getAcceleration();
	public MutableStat getDeceleration();
	public MutableStat getMaxTurnRate();
	public MutableStat getTurnAcceleration();
	public MutableStat getFluxCapacity();
	public MutableStat getFluxDissipation();
	public MutableStat getEnergyWeaponDamageMult();
	public MutableStat getWeaponDamageMult();
	public MutableStat getDamageTakenMult();
	public MutableStat getWeaponRangeMult();
	public MutableStat getWeaponTurnRateMult();
}
