package com.fs.starfarer.api;

public class Settings {
	private static SettingsAPI api;

	public static SettingsAPI getAPI() {
		return api;
	}

	public static void setAPI(SettingsAPI api) {
		Settings.api = api;
	}
}
