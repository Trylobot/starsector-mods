package com.fs.starfarer.api.campaign;

public interface FactionAPI {
	public float getRelationship(String id);
	public void setRelationship(String id, float newValue);
	public void adjustRelationship(String id, float amount);
	public String getId();
}
