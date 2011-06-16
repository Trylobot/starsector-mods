package data.missions.hierarchy_v_alliance;

import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin
{
	public void defineMission(MissionDefinitionAPI api)
  {
		api.initFleet(FleetSide.PLAYER, "", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ATTACK, true);

    api.setFleetTagline(FleetSide.PLAYER, "Ur-Quan Hierarchy");
    api.setFleetTagline(FleetSide.ENEMY, "Alliance of Free Stars");
    

		api.addToFleet(FleetSide.PLAYER, "sc2_ur-quan_dreadnought_standard", FleetMemberType.SHIP, "", true);
    api.addToFleet(FleetSide.PLAYER, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.PLAYER, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);
    api.addToFleet(FleetSide.PLAYER, "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, false);

		api.addToFleet(FleetSide.ENEMY, "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "", false);
		api.addToFleet(FleetSide.ENEMY, "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "", false);
		api.addToFleet(FleetSide.ENEMY, "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "", false);

		
		// Set up the map.
		float size = 15000f;
		api.initMap(-size/2f, size/2f, -size/2f, size/2f);
    
		float min = -size/2f;
    float max = size/2f;
    
    /* @param x
     * @param y
     * @param radius in pixels.
     */
    api.addNebula( min, 0f, size/2f - 0.08f*size );
    api.addNebula( max, 0f, size/2f - 0.08f*size );
    api.addNebula( 0f, min, size/2f - 0.08f*size );
    api.addNebula( 0f, max, size/2f - 0.08f*size );
    
    /* @param x
     * @param y
     * @param radius
     * @param type available types are defined in data/config/planets.json
     * @param gravity Equal to maximum speed boost the planet provides to nearby ships.
     */
    api.addPlanet( 0f, -5000f , 700f, "large_terran", 1000f);


    /* @param x x coordinate of any point along the middle of the belt.
     * @param y y coordinate of any point along the middle of the belt.
     * @param angle direction, with 0 being to the right and 90 being up.
     * @param width width of belt in pixels.
     * @param minSpeed minimum speed of spawned asteroids.
     * @param maxSpeed maximum speed of spawned asteroids.
     * @param quantity approximate number of asteroids to keep in play as they're destroyed/move off map.
     */
	  api.addAsteroidField( 0f, min + size/4f, 35f, 2000, 0f, 50f, 100);
	  api.addAsteroidField( 0f, max - size/4f, 35f, 2000, 0f, 200f, 100);
	  api.addAsteroidField( 0f, min + size/4f, -35f, 2000, 0f, 200f, 100);
	  api.addAsteroidField( 0f, max - size/4f, -35f, 2000, 0f, 200f, 100);
    
  }

}






