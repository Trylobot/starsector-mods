package data.missions.alliance_v_hierarchy;

import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {

	public void defineMission(MissionDefinitionAPI api) {
    
    // Names --------
    //   Ur-Quan
    //     Lord 3, Lord 18, Lord 21, Lord 43, Lord 52, Lord 88, Lord 89, Lord 103, Lord 156, Lord 237, Lord 342, Lord 412, Lord 476, Lord  666, Lord 783, Lord 999
    //   Earthling
    //     Adama, Belt, Buck, Decker, Ender, Friedlan, Graeme, Halleck, Kucera, Pike, Pirx, Spiff, Trent, Tuf, VanRijn, Wu
		
    // Set up the fleets
		api.initFleet(FleetSide.PLAYER, "", FleetGoal.ATTACK, true);
		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ATTACK, false);

    api.setFleetTagline(FleetSide.PLAYER, "Alliance of Free Stars");
    api.setFleetTagline(FleetSide.ENEMY, "Ur-Quan Hierarchy");

		api.addToFleet(FleetSide.PLAYER, "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "", true);

		// Set up the enemy fleet
		api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_dreadnought_standard", FleetMemberType.SHIP, "", false);
    api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
		
		// Set up the map.
		float width = 10000f;
		float height = 5000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
	}

}






