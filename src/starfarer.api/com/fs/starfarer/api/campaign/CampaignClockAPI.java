package com.fs.starfarer.api.campaign;


public interface CampaignClockAPI {
	public int getCycle();
	public int getMonth();
	public int getDay();
	public int getHour();
	public float convertToDays(float realSeconds);
	public float convertToMonths(float realSeconds);
	public long getTimestamp();
	public float getElapsedDaysSince(long timestamp);
	
	public String getMonthString();
	public String getShortMonthString();
	public float getSecondsPerDay();
}
