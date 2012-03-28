package com.fs.starfarer.api.combat;

import java.util.List;

import com.fs.starfarer.api.mission.FleetSide;

public interface CombatEngineAPI {
	public List<BattleObjectiveAPI> getAllObjectives();
	public List<ShipAPI> getAllShips();
	
	public CombatFleetManagerAPI getFleetManager(FleetSide side);
}
