package com.fs.starfarer.api.combat;


public interface MutableShipStatsAPI {
	public MutableStat getMaxSpeed();
	public MutableStat getAcceleration();
	public MutableStat getDeceleration();
	public MutableStat getMaxTurnRate();
	public MutableStat getTurnAcceleration();
	
	public MutableStat getFluxCapacity();
	public MutableStat getFluxDissipation();

	public MutableStat getFluxDamageTakenMult();
	public MutableStat getHullDamageTakenMult();
	public MutableStat getArmorDamageTakenMult();
	public MutableStat getShieldDamageTakenMult();
	
	public MutableStat getBeamWeaponDamageMult();
	public MutableStat getEnergyWeaponDamageMult();
	public MutableStat getBallisticWeaponDamageMult();
	public MutableStat getMissileWeaponDamageMult();
	
	public MutableStat getShieldUpkeepMult();
	public MutableStat getShieldAbsorptionMult();
	public MutableStat getShieldTurnRateMult();
	public MutableStat getShieldUnfoldRateMult();

	public StatBonus getEnergyWeaponRangeBonus();
	public StatBonus getBallisticWeaponRangeBonus();
	public StatBonus getMissileWeaponRangeBonus();
	public StatBonus getBeamWeaponRangeBonus();
	
	public StatBonus getWeaponTurnRateBonus();
	public StatBonus getBeamWeaponTurnRateBonus();
	public StatBonus getRepairTimeBonus();
	public StatBonus getWeaponHealthBonus();
	public StatBonus getEngineHealthBonus();
	public StatBonus getArmorBonus();
	public StatBonus getHullBonus();
	
	public StatBonus getShieldArcBonus();
	
	public StatBonus getBallisticAmmoBonus();
	public StatBonus getEnergyAmmoBonus();
	public StatBonus getMissileAmmoBonus();

}
