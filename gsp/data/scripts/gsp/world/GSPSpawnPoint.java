package data.scripts.gsp.world;

import com.fs.starfarer.api.campaign.CampaignFleetAPI;
import com.fs.starfarer.api.campaign.FleetAssignment;
import com.fs.starfarer.api.campaign.LocationAPI;
import com.fs.starfarer.api.campaign.SectorAPI;
import com.fs.starfarer.api.campaign.SectorEntityToken;

import data.scripts.world.*;

public class GSPSpawnPoint extends BaseSpawnPoint {

	public GSPSpawnPoint(SectorAPI sector, LocationAPI location, float daysInterval, int maxFleets, SectorEntityToken anchor) {
		super(sector, location, daysInterval, maxFleets, anchor);
	}

	@Override
	protected CampaignFleetAPI spawnFleet() {
		
		CampaignFleetAPI fleet = getSector().createFleet("gratuitous_space_pirates", "battleFleet");
		getLocation().spawnFleet(getAnchor(), 0, 0, fleet);
		fleet.addAssignment(FleetAssignment.RAID_SYSTEM, null, 10);
		
		return fleet;
	}

}
