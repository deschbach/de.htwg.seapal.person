package de.htwg.seapal.person.database.impl;

import java.util.HashMap;

import de.htwg.seapal.person.database.IPersonDatabase;
import de.htwg.seapal.person.models.IPerson;

public class PersonHashMapDatabase implements IPersonDatabase {

	private HashMap<String, IPerson> database = new HashMap<String, IPerson>();
	
	@Override
	public IPerson getPersonById(String personId) {
		return database.get(personId);
	}

	@Override
	public void savePersonById(String personId, IPerson person) {
		database.put(personId, person);
	}

	@Override
	public void deletePersonById(String personId) {
		database.remove(personId);
	}

	@Override
	public boolean containsPerson(String peronId) {
		return database.containsKey(peronId);
	}

}
