/**
 * 
 */
package com.fs.starfarer.api.fleet;

/**
 * What the fleet is trying to accomplish in a battle.  Determines how missions are scored, and what
 * the outcome of battles in the full game is.  For example, if one fleet's goal is "ESCAPE", any ships
 * that successfully retreat from battle will be able to continue on their way, while other ships
 * may be captured.
 * @author Alex Mosolov
 *
 */
public enum FleetGoal {
	/**
	 * Fleet is attacking. Penalty to command points available (the attack is hurried), but able to
	 * engage an enemy fleet trying to escape.
	 */
	ATTACK("goal_Attack"),
	
	/**
	 * Fleet is cautiously engaging the enemy. Advantageous vs an attacker, but if the enemy is trying to
	 * escape, they will be able to do so without battle. 
	 */
	DEFEND("goal_Defend"),
		
	/**
	 * Fleet is trying to escape.  An attacking enemy fleet will catch up and force a battle 
	 */
	ESCAPE("goal_Escape");
	
	
	
	private String warroomTooltipId;

	private FleetGoal(String warroomTooltipId) {
		this.warroomTooltipId = warroomTooltipId;
	}
	public String getWarroomTooltipId() {
		return warroomTooltipId;
	}

}