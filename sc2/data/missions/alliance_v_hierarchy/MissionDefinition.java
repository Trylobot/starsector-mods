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
		api.initFleet(FleetSide.PLAYER, "", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ATTACK, true);

    api.setFleetTagline(FleetSide.PLAYER, "Alliance of Free Stars");
    api.setFleetTagline(FleetSide.ENEMY, "Ur-Quan Hierarchy");

    
		api.addToFleet(FleetSide.PLAYER, "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "", true);
		api.addToFleet(FleetSide.PLAYER, "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "", false);
		api.addToFleet(FleetSide.PLAYER, "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "", false);

		// Set up the enemy fleet
		api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_dreadnought_standard", FleetMemberType.SHIP, "", false);
    api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.ENEMY, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
		
		// Set up the map.
		float size = 15000f;
		api.initMap(-size/2f, size/2f, -size/2f, size/2f);
    
		float min = -size/2f;
    float max = size/2f;
    
    api.addNebula( min, 0f, size/2f - 0.08f*size );
    api.addNebula( max, 0f, size/2f - 0.08f*size );
    api.addNebula( 0f, min, size/2f - 0.08f*size );
    api.addNebula( 0f, max, size/2f - 0.08f*size );
    
    api.addPlanet( 0f, 0f , 700f, "terran", 700f);
	}

}






