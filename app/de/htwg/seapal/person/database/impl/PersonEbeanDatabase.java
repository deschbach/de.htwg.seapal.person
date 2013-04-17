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
		Ebean.save(tPers);
	}

	@Override
	public boolean containsPerson(String personId) {
		return getPersonById(personId) != null;
	}

	@Override
	public IPerson getPersonById(String personId) {
		return Ebean.find(Person.class, personId);
	}

	@Override
	public void deletePersonById(String personId) {
		Ebean.delete(Person.class, personId);
	}
	
	
}
