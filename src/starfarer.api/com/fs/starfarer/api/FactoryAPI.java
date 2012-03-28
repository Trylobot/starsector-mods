package com.fs.starfarer.api;

import com.fs.starfarer.api.characters.PersonAPI;

public interface FactoryAPI {
	public PersonAPI createPerson();
}
