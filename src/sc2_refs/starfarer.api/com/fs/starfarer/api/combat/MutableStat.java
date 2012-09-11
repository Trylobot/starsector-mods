package com.fs.starfarer.api.combat;

import java.util.HashMap;

public class MutableStat {

	private static enum StatModType {
		PERCENT,
		FLAT,
	}
	
	private static class StatMod {
		private String source;
		private StatModType type;
		private float value;
		public StatMod(String source, StatModType type, float value) {
			this.source = source;
			this.type = type;
			this.value = value;
		}
		public String getSource() {
			return source;
		}
		public StatModType getType() {
			return type;
		}
		public float getValue() {
			return value;
		}
	}
	
	public float base;
	public float modified;
	
	//private List<StatMod> mods = new LinkedList<StatMod>();
	private HashMap<String, StatMod> flatMods = new HashMap<String, StatMod>();
	private HashMap<String, StatMod> percentMods = new HashMap<String, StatMod>();
	
	private boolean needsRecompute = false;
	public MutableStat(float base) {
		this.base = base;
		modified = base;
	}
	
	public void modifyFlat(String source, float value) {
		StatMod mod = flatMods.get(source);
		if (mod == null && value == 0) return;
		if (mod != null && mod.value == value) return;
		
		mod = new StatMod(source, StatModType.FLAT, value);
		flatMods.put(source, mod);
		needsRecompute = true;
	}
	
	public void modifyPercent(String source, float value) {
		StatMod mod = percentMods.get(source);
		if (mod == null && value == 0) return;
		if (mod != null && mod.value == value) return;
		
		mod = new StatMod(source, StatModType.PERCENT, value);
		percentMods.put(source, mod);
		needsRecompute = true;
	}
	
	public void unmodify() {
		flatMods.clear();
		percentMods.clear();
		needsRecompute = true;
	}
	
	public void unmodify(String source) {
		StatMod mod = flatMods.remove(source);
		if (mod != null && mod.value != 0) needsRecompute = true; 
		mod = percentMods.remove(source);
		if (mod != null && mod.value != 0) needsRecompute = true;
	}
	
	public void unmodifyFlat(String source) {
		StatMod mod = flatMods.remove(source);
		if (mod != null && mod.value != 0) needsRecompute = true;
	}
	
	public void unmodifyPercent(String source) {
		StatMod mod = percentMods.remove(source);
		if (mod != null && mod.value != 0) needsRecompute = true;
	}	
	
	private void recompute() {
		float flatMod = 0;
		float percentMod = 0;
		for (StatMod mod : percentMods.values()) {
			percentMod += mod.getValue();
		}
		for (StatMod mod : flatMods.values()) {
			flatMod += mod.getValue();
		}
		
		modified = base + base * percentMod / 100f + flatMod;
		needsRecompute = false;
	}
	
	public float getModifiedValue() {
		if (needsRecompute) recompute();
		return modified;
	}
	
	public float getBaseValue() {
		return base;
	}

}











