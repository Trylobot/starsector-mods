package com.fs.starfarer.api;

import com.fs.starfarer.api.campaign.SectorAPI;

public class Global {
	private static SettingsAPI settingsAPI;
	private static SectorAPI sectorAPI;

	public static SettingsAPI getSettingsAPI() {
		return settingsAPI;
	}

	public static void setSettingsAPI(SettingsAPI api) {
		Global.settingsAPI = api;
	} 
	

	public static SectorAPI getSectorAPI() {
		return sectorAPI;
	}

	public static void setSectorAPI(SectorAPI api) {
		Global.sectorAPI = api;
	}
}
