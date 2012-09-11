package com.fs.starfarer.api.combat;

import java.util.List;

public interface CombatEngineAPI {
	public List<BattleObjectiveAPI> getAllObjectives();
	public List<ShipAPI> getAllShips();
}
