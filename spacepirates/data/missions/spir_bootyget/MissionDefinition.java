package data.missions.spir_bootyget;

import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {

	public void defineMission(MissionDefinitionAPI api) {

		// Set up the fleets
		api.initFleet(FleetSide.PLAYER, "Pirate", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "HSS", FleetGoal.ESCAPE, true);

		// Set a blurb for each fleet
		api.setFleetTagline(FleetSide.PLAYER, "Admiral Steelheart's independent fleet");
		api.setFleetTagline(FleetSide.ENEMY, "Hegemony escort forces");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("Disable the Transports");
		api.addBriefingItem("Destroy the Escort Forces");
		
		// Set up the player's fleet
		api.addToFleet(FleetSide.PLAYER, "kitsune_assault", FleetMemberType.SHIP, "Swashbuckler", true);
		api.addToFleet(FleetSide.PLAYER, "okami_assault", FleetMemberType.SHIP, "Peg-Leg", false);
		
		// Mark player flagship as essential
		//api.defeatOnShipLoss("ESS Indomitable");
		
		// Set up the enemy fleet
		api.addToFleet(FleetSide.ENEMY, "hound_Assault", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "hound_Assault", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "hound_Assault", FleetMemberType.SHIP, false);
		
		// Set up the map.
		float width = 10000f;
		float height = 10000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		/*
		float minX = -width/2;
		float minY = -height/2;
		
		for (int i = 0; i < 15; i++) {
			float x = (float) Math.random() * width - width/2;
			float y = (float) Math.random() * height - height/2;
			float radius = 100f + (float) Math.random() * 900f; 
			api.addNebula(x, y, radius);
		}
		
		api.addNebula(minX + width * 0.8f, minY + height * 0.4f, 2000);
		api.addNebula(minX + width * 0.8f, minY + height * 0.5f, 2000);
		api.addNebula(minX + width * 0.8f, minY + height * 0.6f, 2000);
		
		api.addObjective(minX + width * 0.8f, minY + height * 0.4f, "nav_buoy");
		api.addObjective(minX + width * 0.8f, minY + height * 0.6f, "nav_buoy");
		api.addObjective(minX + width * 0.3f, minY + height * 0.3f, "comm_relay");
		api.addObjective(minX + width * 0.3f, minY + height * 0.7f, "comm_relay");
		api.addObjective(minX + width * 0.5f, minY + height * 0.5f, "sensor_array");
		api.addObjective(minX + width * 0.2f, minY + height * 0.5f, "sensor_array");
		
		// Add an asteroid field
		api.addAsteroidField(minX + width * 0.3f, minY, 90, 3000f,
								20f, 70f, 50);
		
		// Add some planets.  These are defined in data/config/planets.json.
		api.addPlanet(minX + width * 0.2f + 600, minY + height * 0.5f, 250f, "ice_giant", 200f);
		api.addPlanet(minX + width * 0.6f + 600, minY + height * 0.3f, 150f, "cryovolcanic", 100f);
		*/
	}

}






