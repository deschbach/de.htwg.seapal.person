package de.htwg.seapal.person.database;

import de.htwg.seapal.person.models.IPerson;

public interface IPersonDatabase {
	
	boolean containsPerson(String peronId);
	
	IPerson getPersonById(String personId);
	
	void savePersonById(String personId, IPerson person);
	
	void deletePersonById(String personId);
}
