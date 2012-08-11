package data.scripts.nom.world;

import com.fs.starfarer.api.campaign.*;
import data.scripts.world.*;

@SuppressWarnings( "unchecked" )
public class SectorGenWithNomads implements SectorGeneratorPlugin
{
	public void generate( SectorAPI sector )
	{
		StarSystemAPI system = sector.getStarSystem( "Corvus" );
		
		GenericWaypointArmadaController spawner = new GenericWaypointArmadaController(
			"nomads",
			"colonyFleet",
			sector, 
			system, 
		  6, /* escort_fleet_count */
			new String[] { "scout" }, /* escort_fleet_composition_pool */
			new float[] { 1 }, /* escort_fleet_composition_weights */
			GenericWaypointArmadaController.ESCORT_ORBIT, /* escort_formation */
			5.0f, /* escort_formation_separation_distance */
			2, /* waypoint_per_trip_minimum */
			4, /* waypoint_per_trip_maximum */
			2, /* waypoint_idle_time_days */
			7 /* out_of_sector_time_days */ );
		system.addSpawnPoint( spawner ); // automatic from here on out

		FactionAPI faction = sector.getFaction( "nomads" );
		faction.setRelationship( "player",                 -1 );
		faction.setRelationship( "hegemony",               -1 );
		faction.setRelationship( "tritachyon",             -1 );
		faction.setRelationship( "pirates",                -1 );
		faction.setRelationship( "independent",            -1 );
	}
	
}
