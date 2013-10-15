package data.missions.nomads_test;

import com.fs.starfarer.api.campaign.CargoAPI;
import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin
{
	public void defineMission( MissionDefinitionAPI api )
	{
		// Set up the fleets
		api.initFleet(FleetSide.PLAYER, "NA", FleetGoal.ATTACK, false);
		api.setFleetTagline(FleetSide.PLAYER, "The Nomad Armada");
		
		api.initFleet(FleetSide.ENEMY, "TTS", FleetGoal.ATTACK, true);
		api.setFleetTagline(FleetSide.ENEMY, "Hegemony Forces");
		
		// Nomad fighters
		api.addToFleet(FleetSide.PLAYER, "nom_toad_wing", FleetMemberType.FIGHTER_WING, false).setCrewXPLevel( CargoAPI.CrewXPLevel.VETERAN );
		api.addToFleet(FleetSide.PLAYER, "nom_iguana_wing", FleetMemberType.FIGHTER_WING, false).setCrewXPLevel( CargoAPI.CrewXPLevel.VETERAN );
		api.addToFleet(FleetSide.PLAYER, "nom_scarab_wing", FleetMemberType.FIGHTER_WING, false).setCrewXPLevel( CargoAPI.CrewXPLevel.VETERAN );

		// Vanilla fighters (pick 1)
		String[] variantIds = {
			"broadsword_wing",
			"xyphos_wing",
			"gladius_wing",
			"warthog_wing",
			"thunder_wing",
			"talon_wing",
			"wasp_wing",
			"dagger_wing",
			"piranha_wing",
			"trident_wing",
			"longbow_wing",
			"mining_drone_wing"
		};
		int idx = (int)(Math.random() * variantIds.length);
		api.addToFleet(FleetSide.ENEMY, variantIds[idx], FleetMemberType.FIGHTER_WING, false).setCrewXPLevel( CargoAPI.CrewXPLevel.VETERAN );
		
		// Set up the map.
		float width = 8000f;
		float height = 8000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
	}

}






