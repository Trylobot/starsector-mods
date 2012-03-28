package com.fs.starfarer.api.campaign;

public interface LocationAPI {
	void addSpawnPoint(SpawnPointPlugin point);
	void spawnFleet(SectorEntityToken anchor, float xOffset, float yOffset, CampaignFleetAPI fleet);
	

	SectorEntityToken createToken(float x, float y);
}





