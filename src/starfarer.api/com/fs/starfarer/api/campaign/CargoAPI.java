package com.fs.starfarer.api.campaign;

import java.util.List;

import com.fs.starfarer.api.fleet.FleetMemberType;

public interface CargoAPI {

	public static class CargoItemQuantity<T> {
		T item;
		int count;
		
		public CargoItemQuantity(T item, int count) {
			this.item = item;
			this.count = count;
		}
		
		public int getCount() {
			return count;
		}
		
		public T getItem() {
			return item;
		}
	}

	public static enum CrewXPLevel {
		GREEN("green_crew", "icon_crew_green", "Green"),
		REGULAR("regular_crew", "icon_crew_regular", "Regular"),
		VETERAN("veteran_crew", "icon_crew_veteran", "Veteran"),
		ELITE("elite_crew", "icon_crew_elite", "Elite");
		
		private String id;
		private String rankIconKey;
		private String prefix;
		private CrewXPLevel(String id, String iconKey, String prefix) {
			this.id = id;
			this.rankIconKey = iconKey;
			this.prefix = prefix;
		}
		public String getPrefix() {
			return prefix;
		}
		public String getId() {
			return id;
		}
		public String getRankIconKey() {
			return rankIconKey;
		}
	}
	public static enum CargoItemType {
		WEAPONS,
		BLUEPRINTS,
		RESOURCES,
		NULL,
	}
	
	
	List<CargoItemQuantity<String>> getWeapons();
	
	int getNumWeapons(String id);
	void removeWeapons(String id, int count);
	void addWeapons(String id, int count);
	
	float getSupplies();
	float getFuel();
	
	int getTotalCrew();
	void addCrew(CargoAPI.CrewXPLevel level, int quantity);
	int getCrew(CargoAPI.CrewXPLevel level);
	int getMarines();
	void addMarines(int quantity);
	void removeMarines(int quantity);
	
	void addFuel(float quantity);
	void removeFuel(float quantity);
	void addSupplies(float quantity);
	void removeSupplies(float quantity);
	public void removeCrew(CargoAPI.CrewXPLevel level, int quantity);
	
	public void addItems(CargoAPI.CargoItemType itemType, Object data, float quantity);
	public boolean removeItems(CargoAPI.CargoItemType itemType, Object data, float quantity);
	
	public void addMothballedShip(FleetMemberType type, String variantOrWingId, String optionalName);
}












