package com.fs.starfarer.api;

public class Factory {
	private static FactoryAPI api;

	public static FactoryAPI getAPI() {
		return api;
	}

	public static void setAPI(FactoryAPI api) {
		Factory.api = api;
	}
}
