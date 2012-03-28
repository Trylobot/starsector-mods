package com.fs.starfarer.api.plugins;

import com.fs.starfarer.api.combat.BattleObjectiveAPI;

public interface FleetPointsFromBattleObjectivesPlugin extends CombatEnginePlugin {
	public int getFleetPointValue(BattleObjectiveAPI objective);
}
