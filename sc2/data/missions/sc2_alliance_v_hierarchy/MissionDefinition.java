package data.missions.sc2_alliance_v_hierarchy;
import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

import data.missions.sc2_common.ToysForBob;

public class MissionDefinition implements MissionDefinitionPlugin
{
	public void defineMission(MissionDefinitionAPI api)
  {
    ToysForBob sc2 = new ToysForBob();
    
		api.initFleet(FleetSide.PLAYER, "", FleetGoal.ATTACK, false);
    api.setFleetTagline(FleetSide.PLAYER, "Alliance of Free Stars");
    sc2.addAllianceAll( FleetSide.PLAYER, api );

		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ATTACK, true);
    api.setFleetTagline(FleetSide.ENEMY, "Ur-Quan Hierarchy");
    sc2.addHierarchyAll( FleetSide.ENEMY, api );
		
    sc2.initLevel( api );
	}
}
