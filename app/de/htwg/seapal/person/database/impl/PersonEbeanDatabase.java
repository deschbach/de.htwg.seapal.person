package de.htwg.seapal.person.database.impl;

import com.avaje.ebean.Ebean;

import de.htwg.seapal.person.database.IPersonDatabase;
import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.models.impl.Person;

public class PersonEbeanDatabase implements IPersonDatabase {

	@Override
	public String newPerson() {
		Person tpers = new Person();
		Ebean.save(tpers);
		return tpers.getId();
	}

	@Override
	public void savePerson(IPerson person) {
		Person tPers = new Person(person);
		Ebean.update(tPers);
	}

	@Override
	public boolean containsPerson(String personId) {
		return getPersonById(personId) != null;
	}

	@Override
	public IPerson getPersonById(String personId) {
		return Ebean.find(Person.class, getInternalId(personId));
	}

	@Override
	public void deletePersonById(String personId) {
		Ebean.delete(Person.class, getInternalId(personId));
	}
	
	private long getInternalId(String personId) {
		int tIndex = personId.indexOf('-');
		if (tIndex == -1) {
			throw new IllegalArgumentException(
					"The person entity id must have the format PERSON-0. No - found.");
		}
		return Long.parseLong(personId.substring(tIndex + 1));
	}
	
	
}
