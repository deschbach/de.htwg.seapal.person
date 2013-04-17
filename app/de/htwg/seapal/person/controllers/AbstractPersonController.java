package de.htwg.seapal.person.controllers;

import java.util.Date;

import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.database.IPersonDatabase;
import de.htwg.seapal.person.util.observer.Observable;


public abstract class AbstractPersonController extends Observable implements IPersonController {

	private IPerson person;

	private IPersonDatabase database;
	
	public IPerson getPerson() {
		return person;
	}

	public void setPerson(IPerson person) {
		this.person = person;
	}
	
	@Override
	public String getPersonFirstname(String personId) {	
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getFirstname();
		} else {
			return null;
		}

	}

	@Override
	public void setPersonFirstname(String personId, String firstname) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setFirstname(firstname);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public String getPersonLastname(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getLastname();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonLastname(String personId, String lastname) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setLastname(lastname);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public Date getPersonBirth(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getBirth();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonBirth(String personId, Date birth) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setBirth(birth);
			database.savePerson(person);
		}
		notifyObservers();
	}
	
	@Override
	public Date getPersonRegistration(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getRegistration();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonRegistration(String personId, Date registration) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setRegistration(registration);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public int getPersonAge(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getAge();
		} else {
			return 0;
		}
	}

	@Override
	public void setPersonAge(String personId, int age) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setAge(age);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public String getPersonNationality(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getNationality();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonNationality(String personId, String nationality) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setNationality(nationality);
			database.savePerson(person);
		}
		notifyObservers();
	}
	
	@Override
	public String getPersonEmail(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getEmail();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonEmail(String personId, String email) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setEmail(email);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public String getPersonTelephone(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getTelephone();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonTelephone(String personId, String telephone) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setTelephone(telephone);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public String getPersonMobile(String personId) {
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getMobile();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonMobile(String personId, String mobile) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setMobile(mobile);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public String getPersonStreet(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getStreet();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonStreet(String personId, String street) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setStreet(street);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public int getPersonPostcode(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getPostcode();
		} else {
			return 0;
		}
	}

	@Override
	public void setPersonPostcode(String personId, int postcode) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setPostcode(postcode);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public String getPersonCity(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getCity();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonCity(String personId, String city) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setCity(city);
			database.savePerson(person);
		}
		notifyObservers();
	}

	@Override
	public String getPersonCountry(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getCountry();
		} else {
			return null;
		}
	}

	@Override
	public void setPersonCountry(String personId, String country) {
		
		if (database.containsPerson(personId)) {
			person = database.getPersonById(personId);
			person.setCountry(country);
			database.savePerson(person);
		}
		notifyObservers();
	}
	
	@Override
	public String getPersonString(String personId) {
		
		if (database.containsPerson(personId)) {
			return database.getPersonById(personId).getString();
		} else {
			return null;
		}
	}

}