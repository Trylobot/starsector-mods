package data.missions.gsp_sevenseas;

import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {

	public void defineMission(MissionDefinitionAPI api) {

		// Set up the fleets
		api.initFleet(FleetSide.PLAYER, "Pirate", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "RFS", FleetGoal.ATTACK, true);

		// Set a blurb for each fleet
		api.setFleetTagline(FleetSide.PLAYER, "Admiral Steelheart's independent fleet");
		api.setFleetTagline(FleetSide.ENEMY, "The Fleet of the Royal High-Guard");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("Emerge victorious");
		api.addBriefingItem("Survival is optional");
		
		// Set up the player's fleet
    api.addToFleet(FleetSide.PLAYER, "gsp_senkan_elite", FleetMemberType.SHIP, "Rusty Cutlass", true);
    api.addToFleet(FleetSide.PLAYER, "gsp_washi_elite", FleetMemberType.SHIP, "Bilge Pump", true);
    api.addToFleet(FleetSide.PLAYER, "gsp_pyuma_support", FleetMemberType.SHIP, "Scourge", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_pyuma_support", FleetMemberType.SHIP, "Six-Pounder", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_pyuma_support", FleetMemberType.SHIP, "Keg", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_okami_assault", FleetMemberType.SHIP, "Grapnel", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_okami_assault", FleetMemberType.SHIP, "Mainsail", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_okami_assault", FleetMemberType.SHIP, "Drunkard", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_kitsune_assault", FleetMemberType.SHIP, "Swashbuckle", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_kitsune_assault", FleetMemberType.SHIP, "Buccaneer", false);
    api.addToFleet(FleetSide.PLAYER, "gsp_kitsune_assault", FleetMemberType.SHIP, "Cutthroat", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_taka_wing", FleetMemberType.FIGHTER_WING, "Carousers", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_taka_wing", FleetMemberType.FIGHTER_WING, "Wenches", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_taka_wing", FleetMemberType.FIGHTER_WING, "Strumpets", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hayabusa_wing", FleetMemberType.FIGHTER_WING, "Lubber", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hayabusa_wing", FleetMemberType.FIGHTER_WING, "Interlopers", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hayabusa_wing", FleetMemberType.FIGHTER_WING, "Brethren", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hyou_wing", FleetMemberType.FIGHTER_WING, "Bilge Rats", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hyou_wing", FleetMemberType.FIGHTER_WING, "Barnacles", false);
		api.addToFleet(FleetSide.PLAYER, "gsp_hyou_wing", FleetMemberType.FIGHTER_WING, "Salty Dogs", false);
		
		// Set up the enemy fleet
    api.addToFleet(FleetSide.ENEMY, "conquest_Elite", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "brawler_Assault", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "brawler_Assault", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "brawler_Assault", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "brawler_Assault", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "enforcer_Balanced", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "enforcer_CS", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "wolf_Assault", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "wolf_Assault", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "wolf_PD", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "tempest_Attack", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "tempest_Attack", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "tempest_Attack", FleetMemberType.SHIP, false);
    api.addToFleet(FleetSide.ENEMY, "gemini_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "broadsword_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "broadsword_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "wasp_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "wasp_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "wasp_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "wasp_wing", FleetMemberType.FIGHTER_WING, false);


		// Set up the map.
		float width = 15000f;
		float height = 12000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		api.addNebula(minX + width * 0.2f, minY + height * 0.2f, 1500);
		api.addNebula(minX + width * 0.8f, minY + height * 0.2f, 1500);
		api.addNebula(minX + width * 0.2f, minY + height * 0.8f, 1500);
		api.addNebula(minX + width * 0.8f, minY + height * 0.8f, 1500);
		
    // "comm_relay"   +30 fp
		// "sensor_array" +10 fp, +25% range
		// "nav_buoy"     +10 fp, +25% speed
		api.addObjective(minX + width * 0.2f, minY + height * 0.2f, "sensor_array");
		api.addObjective(minX + width * 0.8f, minY + height * 0.2f, "nav_buoy");
		api.addObjective(minX + width * 0.2f, minY + height * 0.8f, "sensor_array");
		api.addObjective(minX + width * 0.8f, minY + height * 0.8f, "nav_buoy");
    api.addObjective(minX + width * 0.3f, minY + height * 0.5f, "comm_relay");
		
		// Add an asteroid field
		api.addAsteroidField(minX + width * 0.3f, minY, 90, 3000f, 20f, 70f, 50);
		api.addAsteroidField(minX + width * 0.5f, minY + height * 0.5f, 0, 1800f, 18f, 72f, 25);
		
		// Add some planets.  These are defined in data/config/planets.json.
		api.addPlanet(minX + width * 0.2f + 600, minY + height * 0.5f, 400f, "lava", 300f);
	}

}






