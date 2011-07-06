package data.missions.sc2_common;

import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;

public class ToysForBob
{
  public class ShipData
  {
    String variantId;
    FleetMemberType type;
    String shipName;
    
    public ShipData( String variantId, FleetMemberType type, String shipName )
    {
      this.variantId = variantId;
      this.type = type;
      this.shipName = shipName;
    }
  }
  
  public static int alliance_count = 2;
  public static int hierarchy_count = 2;
  
  public ShipData[][] alliance_catalog;
  public ShipData[][] hierarchy_catalog;
  public ShipData[][] allships_catalog;
  
  public ToysForBob()
  {
    alliance_catalog = new ShipData[alliance_count][];
    hierarchy_catalog = new ShipData[hierarchy_count][];
    allships_catalog = new ShipData[alliance_count + hierarchy_count][];
    
    int alliance_i = 0;
    int hierarchy_i = 0;
    int allships_i = 0;
    
    ShipData[] pick;
    int i;
    
    pick = new ShipData[4];
    i = 0;
    pick[i++] = new ShipData( "sc2_ur-quan_dreadnought_standard", FleetMemberType.SHIP, "Ur-Quan Kzer-Za" );
    pick[i++] = new ShipData( "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, null );
    pick[i++] = new ShipData( "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, null );
    pick[i++] = new ShipData( "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING, null );
    hierarchy_catalog[hierarchy_i++] = pick;
    allships_catalog[allships_i++] = pick;
    
    pick = new ShipData[1];
    i = 0;
    pick[i++] = new ShipData( "sc2_melnorme_trader_standard", FleetMemberType.SHIP, "Melnorme" );
    hierarchy_catalog[hierarchy_i++] = pick;
    allships_catalog[allships_i++] = pick;
    
    pick = new ShipData[1];
    i = 0;
    pick[i++] = new ShipData( "sc2_earthling_cruiser_standard", FleetMemberType.SHIP, "Earthling" );
    alliance_catalog[alliance_i++] = pick;
    allships_catalog[allships_i++] = pick;

    pick = new ShipData[1];
    i = 0;
    pick[i++] = new ShipData( "sc2_orz_nemesis_standard", FleetMemberType.SHIP, "Orz" );
    alliance_catalog[alliance_i++] = pick;
    allships_catalog[allships_i++] = pick;
  }
  
  public void addAllianceAll( FleetSide side, MissionDefinitionAPI api )
  {
    addCatalog( side, api, alliance_catalog );
  }
  
  public void addHierarchyAll( FleetSide side, MissionDefinitionAPI api )
  {
    addCatalog( side, api, hierarchy_catalog );
  }
  
  public void addRandomAny( FleetSide side, MissionDefinitionAPI api )
  {
    addPick( side, api, randomPick( allships_catalog ));
  }
  
  public void addCatalog( FleetSide side, MissionDefinitionAPI api, ShipData[][] catalog )
  {
    for( int i = 0; i < catalog.length; ++i )
      addPick( side, api, catalog[i] );
  }
  
  public void addPick( FleetSide side, MissionDefinitionAPI api, ShipData[] pick )
  {
    for( int i = 0; i < pick.length; ++i )
    {
      ShipData ship = pick[i];
      boolean isFlagship = false;
      if( side      == FleetSide.PLAYER
      &&  ship.type == FleetMemberType.SHIP )
        isFlagship = true;
      
      if( ship.shipName != null )
        api.addToFleet( side, ship.variantId, ship.type, ship.shipName, isFlagship );
      else
        api.addToFleet( side, ship.variantId, ship.type, isFlagship );
    }
  }
  
  public ShipData[] randomPick( ShipData[][] catalog )
  {
    return catalog[ (int) (Math.random() * catalog.length) ]; 
  }
  
  public void initLevel( MissionDefinitionAPI api )
  {
		// Set up the map.
		float size = 15000f;
		api.initMap(-size/2f, size/2f, -size/2f, size/2f);
    
		float min = -size/2f;
    float max = size/2f;
    
    /* @param x
     * @param y
     * @param radius in pixels. */
    api.addNebula( min, 0f, size/2f - 0.08f*size );
    api.addNebula( max, 0f, size/2f - 0.08f*size );
    api.addNebula( 0f, min, size/2f - 0.08f*size );
    api.addNebula( 0f, max, size/2f - 0.08f*size );
    
    /* @param x
     * @param y
     * @param radius
     * @param type available types are defined in data/config/planets.json
     * @param gravity Equal to maximum speed boost the planet provides to nearby ships. */
    api.addPlanet( 0f, 0f , 700f, "large_terran", 1000f);


    /* @param x x coordinate of any point along the middle of the belt.
     * @param y y coordinate of any point along the middle of the belt.
     * @param angle direction, with 0 being to the right and 90 being up.
     * @param width width of belt in pixels.
     * @param minSpeed minimum speed of spawned asteroids.
     * @param maxSpeed maximum speed of spawned asteroids.
     * @param quantity approximate number of asteroids to keep in play as they're destroyed/move off map. */
	  api.addAsteroidField( 0f, min + size/4f, 35f, 2000, 0f, 50f, 100);
	  api.addAsteroidField( 0f, max - size/4f, 35f, 2000, 0f, 200f, 100);
	  api.addAsteroidField( 0f, min + size/4f, -35f, 2000, 0f, 200f, 100);
	  api.addAsteroidField( 0f, max - size/4f, -35f, 2000, 0f, 200f, 100);
  }
  
}
