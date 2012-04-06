package data.scripts.gsp.world;

import java.awt.Color;
import java.util.List;

import com.fs.starfarer.api.campaign.CampaignFleetAPI;
import com.fs.starfarer.api.campaign.CargoAPI;
import com.fs.starfarer.api.campaign.FactionAPI;
import com.fs.starfarer.api.campaign.FleetAssignment;
import com.fs.starfarer.api.campaign.SectorAPI;
import com.fs.starfarer.api.campaign.SectorEntityToken;
import com.fs.starfarer.api.campaign.SectorGeneratorPlugin;
import com.fs.starfarer.api.campaign.StarSystemAPI;
import com.fs.starfarer.api.campaign.CargoAPI.CrewXPLevel;
import com.fs.starfarer.api.fleet.FleetMemberType;

import data.scripts.world.*;

@SuppressWarnings( "unchecked" )
public class CorvusGSP extends SectorGeneratorPlugin
{
	public void generate( SectorAPI sector )
	{
		StarSystemAPI system = sector.getStarSystem( "Corvus" );
		SectorEntityToken token = system.createToken(-15000, -15000);
		GSPSpawnPoint spawn = new GSPSpawnPoint(sector, system, 7, 1, token);
		system.addSpawnPoint( spawn );

		// faction api's referenced by string to increase standalone compatibility
		FactionAPI faction = sector.getFaction( "gratuitous_space_pirates" );
		faction.setRelationship( "player",       -1 );
		faction.setRelationship( "hegemony",     -1 );
		faction.setRelationship( "tritachyon",   -1 );
		faction.setRelationship( "pirates",      -1 );
		faction.setRelationship( "independent",  -1 );
		faction.setRelationship( "nomads",       -1 );
		faction.setRelationship( "junk_pirates", -1 );
	}
	
}
