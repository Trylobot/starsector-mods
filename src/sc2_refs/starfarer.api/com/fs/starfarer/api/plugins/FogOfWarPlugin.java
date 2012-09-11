package com.fs.starfarer.api.plugins;

import com.fs.starfarer.api.combat.FogOfWarAPI;

public interface FogOfWarPlugin extends CombatEnginePlugin {
	public void reveal(FogOfWarAPI fogOfWar);
	public void hide(FogOfWarAPI fogOfWar);
}
