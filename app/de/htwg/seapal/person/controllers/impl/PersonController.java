package de.htwg.seapal.person.controllers.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.controllers.IPersonController;
import de.htwg.seapal.person.database.IPersonDatabase;
import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.common.observer.Observable;

@Singleton
public class PersonController extends Observable implements IPersonController {
	
	
	@Inject
	private IPersonDatabase database;
	
	@Inject
	private IBoatController boatController;

	@Override
	public Map<String, String> getPersonList() {
		return null;
	}

	@Override
	public String addPerson() {
		return database.newPerson();
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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
		
		IPerson person = null;
		
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

	@Override
	public Map<String, String> getPersonBoats(String personId) {
		return boatController.getBoats();
	}

	@Override
	public String getPersonBoatsString(String personId) {
		
		Map<String, String> boats = new HashMap<String, String>();
		boats = boatController.getBoats();
		
		Set<String> boatIds = boats.keySet();
		
		StringBuilder sb = new StringBuilder();
		
		for (String id : boatIds) {
			sb.append("Boat Id: \t");
			sb.append(id).append("\n");
			sb.append("Boat Name: \t");
			sb.append(boats.get(id)).append(" ");
		}
		
		return sb.toString();
		
	}
}