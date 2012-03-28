package com.fs.starfarer.api.fleet;

import com.fs.starfarer.api.campaign.CargoAPI;
import com.fs.starfarer.api.characters.PersonAPI;

public interface FleetMemberAPI {
	PersonAPI getCaptain();
	void setCrewXPLevel(CargoAPI.CrewXPLevel crewXP);
}
