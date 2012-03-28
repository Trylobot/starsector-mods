package com.fs.starfarer.api.mission;


/**
 * Must be implemented by the MissionDefinition.java scripts that create missions.
 * 
 * @author Alex Mosolov
 *
 */
public interface MissionDefinitionPlugin {
	/**
	 * Creates the contents of a mission.
	 * 
	 * Called every time the player clicks on the mission in the list.
	 * 
	 * @param api
	 */
	public void defineMission(MissionDefinitionAPI api);
}
