package data.missions.sc2_hierarchy_v_alliance;
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
    
		api.initFleet(FleetSide.PLAYER, "", FleetGoal.DEFEND, false);
    api.setFleetTagline(FleetSide.PLAYER, "Ur-Quan Hierarchy");
    sc2.addHierarchyAll( FleetSide.PLAYER, api );

		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ATTACK, true);
    api.setFleetTagline(FleetSide.ENEMY, "Alliance of Free Stars");
    sc2.addAllianceAll( FleetSide.ENEMY, api );
		
    sc2.initLevel( api );
  }
}
