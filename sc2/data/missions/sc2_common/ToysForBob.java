package data.missions.sc2_common;

import java.util.*;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;

public class ToysForBob
{
	public ShipData[][] alliance_catalog;
	public ShipData[][] hierarchy_catalog;
	public ShipData[][] allships_catalog;
	
	public static int alliance_count;
	public static int hierarchy_count;

	public HashMap ship_names;
	
	public class ShipData
	{
		String variantId;
		FleetMemberType type;
		String shipName;
		
		public ShipData( String variantId, FleetMemberType type )
		{
			this.variantId = variantId;
			this.type = type;
			this.shipName = null; // to be determined at time of pick for each ship individually
		}
	}
	
	public ToysForBob()
	{
		ship_names = new HashMap();

		String[] name_list;
		int n;
		
		name_list = new String[16];
		ship_names.put( "sc2_ur-quan_dreadnought_standard", name_list );
		n = 0;
		name_list[n++] = "Lord 3";
		name_list[n++] = "Lord 18";
		name_list[n++] = "Lord 21";
		name_list[n++] = "Lord 43";
		name_list[n++] = "Lord 52";
		name_list[n++] = "Lord 88";
		name_list[n++] = "Lord 89";
		name_list[n++] = "Lord 103";
		name_list[n++] = "Lord 156";
		name_list[n++] = "Lord 237";
		name_list[n++] = "Lord 342";
		name_list[n++] = "Lord 412";
		name_list[n++] = "Lord 476";
		name_list[n++] = "Lord 666";
		name_list[n++] = "Lord 783";
		name_list[n++] = "Lord 999";
		
		name_list = new String[16];
		ship_names.put( "sc2_melnorme_trader_standard", name_list );
		n = 0;
		name_list[n++] = "Aqua";
		name_list[n++] = "Beige";
		name_list[n++] = "Black";
		name_list[n++] = "Bluish";
		name_list[n++] = "Cerise";
		name_list[n++] = "Cheruse";
		name_list[n++] = "Crimson";
		name_list[n++] = "Fuchsia";
		name_list[n++] = "Grayish";
		name_list[n++] = "Magenta";
		name_list[n++] = "Mauve";
		name_list[n++] = "Orangy";
		name_list[n++] = "Purple";
		name_list[n++] = "Reddish";
		name_list[n++] = "Umber";
		name_list[n++] = "Yellow";

		name_list = new String[16];
		ship_names.put( "sc2_spathi_discriminator_standard", name_list );
		n = 0;
		name_list[n++] = "Bwinkin";
		name_list[n++] = "Jinkeze";
		name_list[n++] = "Kwimp";
		name_list[n++] = "Nargle";
		name_list[n++] = "Phlendo";
		name_list[n++] = "Phwiff";
		name_list[n++] = "Pkunky";
		name_list[n++] = "Plibnik";
		name_list[n++] = "Pwappy";
		name_list[n++] = "Rupatup";
		name_list[n++] = "Snelopy";
		name_list[n++] = "Snurfel";
		name_list[n++] = "Thintho";
		name_list[n++] = "Thwill";
		name_list[n++] = "Whuff";
		name_list[n++] = "Wiffy";

		name_list = new String[16];
		ship_names.put( "sc2_vux_intruder_standard", name_list );
		n = 0;
		name_list[n++] = "DAK";
		name_list[n++] = "FIZ";
		name_list[n++] = "FUP";
		name_list[n++] = "NRF";
		name_list[n++] = "ORZ";
		name_list[n++] = "PIF";
		name_list[n++] = "PUZ";
		name_list[n++] = "VIP";
		name_list[n++] = "YUK";
		name_list[n++] = "ZEK";
		name_list[n++] = "ZIK";
		name_list[n++] = "ZIT";
		name_list[n++] = "ZOG";
		name_list[n++] = "ZRN";
		name_list[n++] = "ZUK";
		name_list[n++] = "ZUP";

		name_list = new String[16];
		ship_names.put( "sc2_earthling_cruiser_standard", name_list );
		n = 0;
		name_list[n++] = "Adama";
		name_list[n++] = "Belt";
		name_list[n++] = "Buck";
		name_list[n++] = "Decker";
		name_list[n++] = "Ender";
		name_list[n++] = "Friedlan";
		name_list[n++] = "Graeme";
		name_list[n++] = "Halleck";
		name_list[n++] = "Kucera";
		name_list[n++] = "Pike";
		name_list[n++] = "Pirx";
		name_list[n++] = "Spiff";
		name_list[n++] = "Trent";
		name_list[n++] = "Tuf";
		name_list[n++] = "VanRijn";
		name_list[n++] = "Wu";

		name_list = new String[16];
		ship_names.put( "sc2_orz_nemesis_standard", name_list );
		n = 0;
		name_list[n++] = "Camper";
		name_list[n++] = "Dancer";
		name_list[n++] = "Deep";
		name_list[n++] = "FatFun";
		name_list[n++] = "Frumple";
		name_list[n++] = "Happy";
		name_list[n++] = "Heavy";
		name_list[n++] = "Hungry";
		name_list[n++] = "Juice";
		name_list[n++] = "Loner";
		name_list[n++] = "NewBoy";
		name_list[n++] = "Pepper";
		name_list[n++] = "Singer";
		name_list[n++] = "Smell";
		name_list[n++] = "Squirt";
		name_list[n++] = "Wet";

		name_list = new String[16];
		ship_names.put( "sc2_yehat_terminator_standard", name_list );
		n = 0;
		name_list[n++] = "Beep-eep";
		name_list[n++] = "Eeep-eep";
		name_list[n++] = "Feep-eep";
		name_list[n++] = "Geep-eep";
		name_list[n++] = "Heep-eep";
		name_list[n++] = "Jeep-eep";
		name_list[n++] = "Leep-eep";
		name_list[n++] = "Meep-eep";
		name_list[n++] = "Neep-eep";
		name_list[n++] = "Peep-eep";
		name_list[n++] = "Reep-eep";
		name_list[n++] = "Teep-eep";
		name_list[n++] = "Veep-eep";
		name_list[n++] = "Weep-eep";
		name_list[n++] = "Yeep-eep";
		name_list[n++] = "Zeep-eep";

		name_list = new String[16];
		ship_names.put( "sc2_mmrnmhrm_x-form_x-wing_standard", name_list );
		ship_names.put( "sc2_mmrnmhrm_x-form_y-wing_standard", name_list );
		n = 0;
		name_list[n++] = "Hm-nhuh";
		name_list[n++] = "Hmr-hun";
		name_list[n++] = "Hrnm-hm";
		name_list[n++] = "Jhe-mhr";
		name_list[n++] = "Jhe-qir";
		name_list[n++] = "Jra-nr";
		name_list[n++] = "Mn-quah";
		name_list[n++] = "Mrm-na";
		name_list[n++] = "Nhuh-na";
		name_list[n++] = "Nrna-mha";
		name_list[n++] = "Qir-nha";
		name_list[n++] = "Qua-qir";
		name_list[n++] = "Qua-rhna";
		name_list[n++] = "Rrma-hrn";
		name_list[n++] = "Um-hrh";
		name_list[n++] = "Ur-mfrs";

		name_list = new String[16];
		ship_names.put( "sc2_zoq-fot-pik_stinger_standard", name_list );
		n = 0;
		name_list[n++] = "DipPak";
		name_list[n++] = "FatPot";
		name_list[n++] = "FipPat";
		name_list[n++] = "FitFap";
		name_list[n++] = "MikMok";
		name_list[n++] = "NikNak";
		name_list[n++] = "PorKoo";
		name_list[n++] = "PukYor";
		name_list[n++] = "RinTin";
		name_list[n++] = "SikSok";
		name_list[n++] = "TikTak";
		name_list[n++] = "TikTok";
		name_list[n++] = "TopNik";
		name_list[n++] = "TotToe";
		name_list[n++] = "ZikFat";
		name_list[n++] = "ZipZak";


		/////
		alliance_count = 4;
		hierarchy_count = 2;

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
		pick[i++] = new ShipData( "sc2_ur-quan_dreadnought_standard", FleetMemberType.SHIP );
		pick[i++] = new ShipData( "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING );
		pick[i++] = new ShipData( "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING );
		pick[i++] = new ShipData( "sc2_ur-quan_autonomous_fighter_wing", FleetMemberType.FIGHTER_WING );
		hierarchy_catalog[hierarchy_i++] = pick;
		allships_catalog[allships_i++] = pick;
		
		pick = new ShipData[1];
		i = 0;
		pick[i++] = new ShipData( "sc2_melnorme_trader_standard", FleetMemberType.SHIP );
		hierarchy_catalog[hierarchy_i++] = pick;
		allships_catalog[allships_i++] = pick;
		
		pick = new ShipData[1];
		i = 0;
		pick[i++] = new ShipData( "sc2_earthling_cruiser_standard", FleetMemberType.SHIP );
		alliance_catalog[alliance_i++] = pick;
		allships_catalog[allships_i++] = pick;

		pick = new ShipData[1];
		i = 0;
		pick[i++] = new ShipData( "sc2_orz_nemesis_standard", FleetMemberType.SHIP );
		alliance_catalog[alliance_i++] = pick;
		allships_catalog[allships_i++] = pick;
		
		pick = new ShipData[1];
		i = 0;
		pick[i++] = new ShipData( "sc2_yehat_terminator_standard", FleetMemberType.SHIP );
		alliance_catalog[alliance_i++] = pick;
		allships_catalog[allships_i++] = pick;

		pick = new ShipData[2];
		i = 0;
		pick[i++] = new ShipData( "sc2_mmrnmhrm_x-form_y-wing_standard", FleetMemberType.SHIP );
		pick[i++] = new ShipData( "sc2_mmrnmhrm_x-form_x-wing_standard", FleetMemberType.SHIP );
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

			String[] name_list = (String[]) ship_names.get( ship.variantId );
			if( name_list != null )
				ship.shipName = name_list[ (int) (Math.random() * name_list.length) ];
			
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
		api.addAsteroidField( 0f, min + size/4f, 35f, 2000, 0f, 50f, 50);
		api.addAsteroidField( 0f, max - size/4f, 35f, 2000, 0f, 200f, 50);
		api.addAsteroidField( 0f, min + size/4f, -35f, 2000, 0f, 200f, 50);
		api.addAsteroidField( 0f, max - size/4f, -35f, 2000, 0f, 200f, 50);
	}
	
}
