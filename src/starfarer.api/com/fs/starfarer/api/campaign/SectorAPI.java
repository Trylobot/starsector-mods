package com.fs.starfarer.api.campaign;

import java.awt.Color;
import java.util.List;


/**
 * Note: generics can not be used in scripts. To help avoid confusion, they are also not used in this api.
 * @author Alex Mosolov
 *
 */
@SuppressWarnings("unchecked")
public interface SectorAPI {
	
	StarSystemAPI getStarSystem(String name);
	
	StarSystemAPI createStarSystem(String name);
	//void removeStarSystem(StarSystemAPI system);
	
	CampaignFleetAPI createFleet(String factionId, String fleetTypeId);
	CampaignClockAPI getClock();
	
	
	FactionAPI getFaction(String factionId);
	
	/**
	 * @return list of Strings.
	 */
	List getAllWeaponIds();
	
	void addMessage(String text);
	public void addMessage(String text, Color color);
}
