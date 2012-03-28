package com.fs.starfarer.api.combat;

import java.util.HashMap;

import com.fs.starfarer.api.combat.MutableStat.StatMod;
import com.fs.starfarer.api.combat.MutableStat.StatModType;

public class StatBonus {

	public float flatBonus = 0f;
	public float mult = 1f;
	
	//private List<StatMod> mods = new LinkedList<StatMod>();
	private HashMap<String, StatMod> flatBonuses = new HashMap<String, StatMod>();
	private HashMap<String, StatMod> percentBonuses = new HashMap<String, StatMod>();
	
	private boolean needsRecompute = false;
	public StatBonus() {
	}
	
	public StatMod getFlatBonus(String source) {
		return flatBonuses.get(source);
	}
	
	public StatMod getPercentBonus(String source) {
		return percentBonuses.get(source);
	}
	
	public void modifyFlat(String source, float value) {
		StatMod mod = flatBonuses.get(source);
		if (mod == null && value == 0) return;
		if (mod != null && mod.value == value) return;
		
		mod = new StatMod(source, StatModType.FLAT, value);
		flatBonuses.put(source, mod);
		needsRecompute = true;
	}
	
	public void modifyPercent(String source, float value) {
		StatMod mod = percentBonuses.get(source);
		if (mod == null && value == 0) return;
		if (mod != null && mod.value == value) return;
		
		mod = new StatMod(source, StatModType.PERCENT, value);
		percentBonuses.put(source, mod);
		needsRecompute = true;
	}
	
	public void unmodify() {
		flatBonuses.clear();
		percentBonuses.clear();
		needsRecompute = true;
	}
	
	public void unmodify(String source) {
		StatMod mod = flatBonuses.remove(source);
		if (mod != null && mod.value != 0) needsRecompute = true; 
		mod = percentBonuses.remove(source);
		if (mod != null && mod.value != 0) needsRecompute = true;
	}
	
	public void unmodifyFlat(String source) {
		StatMod mod = flatBonuses.remove(source);
		if (mod != null && mod.value != 0) needsRecompute = true;
	}
	
	public void unmodifyPercent(String source) {
		StatMod mod = percentBonuses.remove(source);
		if (mod != null && mod.value != 0) needsRecompute = true;
	}	
	
	private void recompute() {
		float flatMod = 0;
		float percentMod = 0;
		for (StatMod mod : percentBonuses.values()) {
			percentMod += mod.getValue();
		}
		for (StatMod mod : flatBonuses.values()) {
			flatMod += mod.getValue();
		}
		
		mult = 1f + percentMod / 100f;
		flatBonus = flatMod;
		
		needsRecompute = false;
	}
	
	public float computeEffective(float baseValue) {
		if (needsRecompute) recompute();
		return baseValue * mult + flatBonus;
	}

	public float getFlatBonus() {
		if (needsRecompute) recompute();
		return flatBonus;
	}
	
	public float getBonusMult() {
		if (needsRecompute) recompute();
		return mult;
	}
	
	public boolean isPositive(float baseValue) {
		return computeEffective(baseValue) > baseValue;
	}
	
	public boolean isNegative(float baseValue) {
		return computeEffective(baseValue) < baseValue;
	}
}











