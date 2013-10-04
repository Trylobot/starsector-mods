package data.missions.sc2_totality;
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
    api.setFleetTagline(FleetSide.PLAYER, "All Ships");
    sc2.addAllianceAll( FleetSide.PLAYER, api );
    sc2.addHierarchyAll( FleetSide.PLAYER, api );

		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ATTACK, true);
    api.setFleetTagline(FleetSide.ENEMY, "All Ships");
    sc2.addAllianceAll( FleetSide.ENEMY, api );
    sc2.addHierarchyAll( FleetSide.ENEMY, api );
		
    sc2.initLevel( api );
	}
}
