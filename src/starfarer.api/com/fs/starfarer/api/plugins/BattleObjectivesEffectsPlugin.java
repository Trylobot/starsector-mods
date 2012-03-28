package com.fs.starfarer.api.plugins;

public interface BattleObjectivesEffectsPlugin extends CombatEnginePlugin {
	void applyEffects();
	float getNavBonusPercent(int owner);
	float getRangeBonusPercent(int owner);
}
