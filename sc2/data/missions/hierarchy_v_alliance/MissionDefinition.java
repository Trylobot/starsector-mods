package data.missions.hierarchy_v_alliance;

import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {

	public void defineMission(MissionDefinitionAPI api) {
    

		api.initFleet(FleetSide.PLAYER, "", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ATTACK, true);

    api.setFleetTagline(FleetSide.PLAYER, "Ur-Quan Hierarchy");
    api.setFleetTagline(FleetSide.ENEMY, "Alliance of Free Stars");
    

		api.addToFleet(FleetSide.PLAYER, "sc2_ur-quan_dreadnought_standard", FleetMemberType.SHIP, "", true);
    api.addToFleet(FleetSide.PLAYER, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.PLAYER, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.PLAYER, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);

		api.addToFleet(FleetSide.ENEMY, "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "", false);

		
		// Set up the map.
		float width = 10000f;
		float height = 5000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
	}

}






