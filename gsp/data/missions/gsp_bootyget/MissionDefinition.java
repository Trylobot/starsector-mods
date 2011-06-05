package data.missions.gsp_bootyget;

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
    api.addToFleet(FleetSide.PLAYER, "gsp_washi_elite", FleetMemberType.SHIP, "The Bilge Pump", true);
		api.addToFleet(FleetSide.PLAYER, "gsp_taka_wing", FleetMemberType.FIGHTER_WING, "Carouser", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_taka_wing", FleetMemberType.FIGHTER_WING, "Wench", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_taka_wing", FleetMemberType.FIGHTER_WING, "Strumpet", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hayabusa_wing", FleetMemberType.FIGHTER_WING, "Lubber", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hayabusa_wing", FleetMemberType.FIGHTER_WING, "Interloper", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hayabusa_wing", FleetMemberType.FIGHTER_WING, "Brethren", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hyou_wing", FleetMemberType.FIGHTER_WING, "Bilge Rat", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hyou_wing", FleetMemberType.FIGHTER_WING, "Hogshead", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_pyuma_support", FleetMemberType.SHIP, "Scourge", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_okami_assault", FleetMemberType.SHIP, "Grapnel", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_kitsune_assault", FleetMemberType.SHIP, "Swashbuckle", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_kitsune_assault", FleetMemberType.SHIP, "Buccaneer", false);
		
		// The Admiral is Essential
		api.defeatOnShipLoss("The Bilge Pump");
		
		// Set up the enemy fleet
		api.addToFleet(FleetSide.ENEMY, "hammerhead_Balanced", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "hammerhead_Balanced", FleetMemberType.SHIP, false);

		// Set up the map.
		float width = 10000f;
		float height = 8000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
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
	}

}






