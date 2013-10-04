package data.scripts.world.systems;
import com.fs.starfarer.api.FactoryAPI;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.FactionAPI;
import com.fs.starfarer.api.campaign.JumpPointAPI;
import com.fs.starfarer.api.campaign.JumpPointAPI.JumpDestination;
import com.fs.starfarer.api.campaign.LocationAPI;
import com.fs.starfarer.api.campaign.OrbitAPI;
import com.fs.starfarer.api.campaign.PlanetAPI;
import com.fs.starfarer.api.campaign.SectorAPI;
import com.fs.starfarer.api.campaign.SectorEntityToken;
import com.fs.starfarer.api.campaign.StarSystemAPI;
import java.awt.Color;
import org.lwjgl.util.vector.Vector2f;

@SuppressWarnings( "unchecked" )
public class SandboxSystem
{
	private FactoryAPI factory;
	
	private SectorAPI sector;
	private LocationAPI hyper;
	
	private StarSystemAPI system;
	private SectorEntityToken system_center_of_mass;
	private PlanetAPI star_A;
	private PlanetAPI star_B;
	

	public void generate( SectorAPI sector )
	{
		// globals
		this.sector = sector;
		factory = Global.getFactory();
		hyper = sector.getHyperspace();
		
		// system
		system = sector.createStarSystem( "SandboxSystem" );
		system.setLightColor( new Color( 185, 185, 240 )); // light color in entire system, affects all entities
		system.getLocation().set( -1000f, -1000f );
		
		// stars, planets, moons, jump points
		init_celestial_bodies( system );
	}
	
	private static final float star_jump_dist_factor_min = 0.8f;
	private static final float star_jump_dist_factor_max = 1.2f;
	
	private void init_celestial_bodies( StarSystemAPI system )
	{
		// stars, planets and moons
		system_center_of_mass = system.createToken( 0f, 0f );
		star_A = system.addPlanet( system_center_of_mass, "Sandbox-A", "star_yellow", 270f, 550f, 1000f, 30f );
 		star_B = system.addPlanet( system_center_of_mass, "Sandbox-B", "star_red", 90f, 450f, 1000f, 30f );

		// jump points
		init_star_gravitywell_jump_point( system, system_center_of_mass, star_A, 
		  star_jump_dist_factor_min, star_jump_dist_factor_max );
		
		init_star_gravitywell_jump_point( system, system_center_of_mass, star_B,
		  star_jump_dist_factor_min, star_jump_dist_factor_max );
	}
	
	private JumpPointAPI init_star_gravitywell_jump_point( StarSystemAPI system, SectorEntityToken system_root, PlanetAPI star, float dist_ratio_min, float dist_ratio_max )
	{
		FactoryAPI factory = Global.getFactory();
		LocationAPI hyper = Global.getSector().getHyperspace();
		
		JumpPointAPI jump_point = factory.createJumpPoint( star.getFullName()+" Gravity Well" );
		JumpDestination destination = new JumpDestination( star, star.getFullName() );
		destination.setMinDistFromToken( dist_ratio_min * star.getRadius() );
		destination.setMaxDistFromToken( dist_ratio_max * star.getRadius() );
		jump_point.addDestination( destination );
		jump_point.setStandardWormholeToStarOrPlanetVisual( star );
		//jump_point.setDestinationVisual(null, null, system_root);
		hyper.addEntity( jump_point );
		
		update_hyperspace_jump_point_location( jump_point, system, system_root, star );
		return jump_point;
	}
	
	// this ratio is an observed ratio between the distances from Corvus to its third planet
	// in hyperspace vs. normal space
	private static final float hyperspace_compression = 0.0612f; // (459f / 7500f) // in pixels at default zoom
	
	private void update_hyperspace_jump_point_location( JumpPointAPI jump_point, StarSystemAPI system, SectorEntityToken system_root, SectorEntityToken system_entity )
	{
		Vector2f system_location = new Vector2f( system.getLocation() );
		Vector2f local_entity_absolute_location = 
		  calculate_absolute_location( system_root, system_entity, hyperspace_compression );

		jump_point.getLocation().set( 
		  system_location.x + local_entity_absolute_location.x,
		  system_location.y + local_entity_absolute_location.y );
	}
	
	// resolves orbits of an entity until the given root object is encountered
	// if entity does not orbit around anything relative to the root, the result is undefined
	private Vector2f calculate_absolute_location( SectorEntityToken root, SectorEntityToken entity, float scale )
	{
		Vector2f location = new Vector2f();
		if( root == null || entity == null )
			return location;
		// loop through the orbital foci until the root is reached
		SectorEntityToken cursor = entity;
		while( cursor != null && cursor != root )
		{
			Vector2f cursor_location = cursor.getLocation();
			if( cursor_location == null )
				return location;
			location.translate( 
			  scale * cursor_location.x, 
			  scale * cursor_location.y );
			OrbitAPI orbit = cursor.getOrbit();
			if( orbit == null )
				return location;
			cursor = orbit.getFocus();
		}
		return location;
	}
	
}
