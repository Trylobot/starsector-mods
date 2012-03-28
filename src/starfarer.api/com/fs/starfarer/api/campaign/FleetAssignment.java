package com.fs.starfarer.api.campaign;

public enum FleetAssignment {
	
	DELIVER_RESOURCES("Delivering resources to"),
	DELIVER_SUPPLIES("Delivering supplies to"),
	DELIVER_FUEL("Delivering fuel to"),
	DELIVER_PERSONNEL("Delivering personnel to"),
	DELIVER_CREW("Delivering crew to"),
	DELIVER_MARINES("Delivering marines to"),
	RESUPPLY("Resupplying at"),
	GO_TO_LOCATION("Proceeding to"),
	PATROL_SYSTEM("Patrolling system"),
	DEFEND_LOCATION("Defending"),
	ATTACK_LOCATION("Attacking"),
	RAID_SYSTEM("Raiding system"),
	GO_TO_LOCATION_AND_DESPAWN("Returning to");
	
	String description;

	private FleetAssignment(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
}
