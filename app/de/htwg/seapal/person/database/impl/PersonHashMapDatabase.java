package de.htwg.seapal.person.database.impl;

import java.util.HashMap;
import java.util.Map;

import de.htwg.seapal.person.database.IPersonDatabase;
import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.models.impl.Person;

public class PersonHashMapDatabase implements IPersonDatabase {

	private Map<String, IPerson> database = new HashMap<String, IPerson>();
	private int personId;
	
	@Override
	public String newPerson() {
		IPerson person = new Person(personId);
		personId++;
		String tId = person.getId();
		database.put(tId, person);
		return tId;
	}
	
	@Override
	public IPerson getPersonById(String personId) {
		return database.get(personId);
	}

	@Override
	public void savePerson(IPerson person) {
		database.put(person.getId(), person);
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
