package data.missions.gsp_caughtredhanded;

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
		api.setFleetTagline(FleetSide.ENEMY, "Interstellar Counter-Terrorist Unit");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("Disable the Transports");
		api.addBriefingItem("Destroy the Escort Forces");
		
		// Set up the player's fleet
    api.addToFleet(FleetSide.PLAYER, "gsp_senkan_elite", FleetMemberType.SHIP, "Rusty Cutlass", true);
    api.addToFleet(FleetSide.PLAYER, "gsp_kitsune_assault", FleetMemberType.SHIP, "Buccaneer", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_kitsune_assault", FleetMemberType.SHIP, "Cutthroat", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_okami_assault", FleetMemberType.SHIP, "Drunkard", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_pyuma_support", FleetMemberType.SHIP, "Six-Pounder", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_hayabusa_wing", FleetMemberType.FIGHTER_WING, "Interlopers", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_taka_wing", FleetMemberType.FIGHTER_WING, "Wenches", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_hyou_wing", FleetMemberType.FIGHTER_WING, "Bilge Rats", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_hyou_wing", FleetMemberType.FIGHTER_WING, "Barnacles", false);
		// The Admiral is Essential
		api.defeatOnShipLoss("The Rusty Cutlass");
		
		// Set up the enemy fleet
    api.addToFleet(FleetSide.ENEMY, "apogee_Balanced", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "eagle_Assault", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "falcon_Support", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "falcon_Support", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "talon_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.ENEMY, "talon_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.ENEMY, "talon_wing", FleetMemberType.FIGHTER_WING, false);


		// Set up the map.
		float width = 9000f;
		float height = 12000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		api.addNebula(minX + width * 0.8f, minY + height * 0.4f, 2000);
		api.addNebula(minX + width * 0.8f, minY + height * 0.5f, 2000);
		api.addNebula(minX + width * 0.8f, minY + height * 0.6f, 2000);
		
		api.addObjective(minX + width * 0.3f, minY + height * 0.3f, "comm_relay");
		api.addObjective(minX + width * 0.3f, minY + height * 0.7f, "comm_relay");
		
		// Add an asteroid field
		api.addAsteroidField(minX + width * 0.3f, minY, 90, 3000f,
								20f, 70f, 50);
		
		// Add some planets.  These are defined in data/config/planets.json.
		api.addPlanet(minX + width * 0.2f + 600, minY + height * 0.5f, 400f, "lava", 300f);
	}

}






