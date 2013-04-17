package de.htwg.seapal.person.database.mock;

import de.htwg.seapal.person.database.IPersonDatabase;
import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.models.mock.Person;

public class PersonHashMapDatabase implements IPersonDatabase {

	@Override
	public IPerson getPersonById(String personId) {
		return new Person();
	}

	@Override
	public void savePerson(IPerson person) {}

	@Override
	public void deletePersonById(String personId) {}

	@Override
	public boolean containsPerson(String peronId) {
		return true;
	}

	@Override
	public String newPerson() {
		return (new Person()).getId();
	}

}
