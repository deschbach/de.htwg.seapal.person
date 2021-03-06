package de.htwg.seapal.person.database.impl;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.seapal.person.database.IPersonDatabase;
import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.models.impl.Person;

public class PersonDb4oDatabase implements IPersonDatabase {

	private ObjectContainer db;
	private int personId = 0;
	
	public PersonDb4oDatabase() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"person.data");
	}
	
	@Override
	public String newPerson() {
		IPerson person = new Person(personId);
		personId++;
		String tId = person.getId();
		savePerson(person);
		return tId;
	}
	
	@Override
	public void savePerson(IPerson person) {
		db.store(person);
	}

	@Override
	public boolean containsPerson(String personId) {	
		return (getPersonById(personId) == null) ? false : true;
	}

	@Override
	public IPerson getPersonById(final String personId) {
		
		List <IPerson> persons = db.query(new Predicate<IPerson>() {

			private static final long serialVersionUID = 1L;

			public boolean match(IPerson person) {
				return person.getId().equals(personId);
			}
		});
		
		if (persons.isEmpty()) {
			return null;			
		} 
		return persons.get(0);
	}

	@Override
	public void deletePersonById(String personId) {
		db.delete(getPersonById(personId));
	}
	
	public void closeDb() {
		db.close();
	}

	

}
