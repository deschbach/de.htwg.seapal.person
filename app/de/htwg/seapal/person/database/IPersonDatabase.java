package de.htwg.seapal.person.database;

import de.htwg.seapal.person.models.IPerson;

public interface IPersonDatabase {
	
	void savePerson(IPerson person);
	
	boolean containsPerson(String peronId);
	
	IPerson getPersonById(String personId);
	
	void deletePersonById(String personId);
}
