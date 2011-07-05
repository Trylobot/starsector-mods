package data.missions.alliance_v_hierarchy;
import data.missions.sc2_common.ToysForBob;

import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin
{
	public void defineMission(MissionDefinitionAPI api)
  {
    ToysForBob sc2 = new ToysForBob();
    
    // Set up the fleets
		api.initFleet(FleetSide.PLAYER, "", FleetGoal.DEFEND, false);
		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ATTACK, true);

    api.setFleetTagline(FleetSide.PLAYER, "Alliance of Free Stars");
    api.setFleetTagline(FleetSide.ENEMY, "Ur-Quan Hierarchy");

    
		api.addToFleet(FleetSide.PLAYER, "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "", true);
		api.addToFleet(FleetSide.PLAYER, "sc2_orz_nemesis_standard", FleetMemberType.SHIP, "", true);

		api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_dreadnought_standard", FleetMemberType.SHIP, "", false);
    api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
		
    sc2.initLevel( api );
	}
}
