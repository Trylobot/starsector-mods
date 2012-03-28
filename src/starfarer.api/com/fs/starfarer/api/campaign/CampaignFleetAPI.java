package com.fs.starfarer.api.campaign;

import org.lwjgl.util.vector.Vector2f;

import com.fs.starfarer.api.Script;

public interface CampaignFleetAPI extends SectorEntityToken {

	Vector2f getLocation();
	void setLocation(float x, float y);
	
	boolean isAlive();
	
	void addAssignment(FleetAssignment assignment, SectorEntityToken target, float maxDurationInDays);
	void addAssignment(FleetAssignment assignment, SectorEntityToken target, float maxDurationInDays, Script onCompletion);
	void clearAssignments();
}
