package de.htwg.seapal.person.controllers.mock;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.inject.Singleton;
import de.htwg.seapal.person.util.observer.Observable;
import de.htwg.seapal.person.controllers.IPersonController;

@Singleton
public class PersonController extends Observable implements IPersonController {
	
	@Override
	public String addPerson() {
		return "PERSON-1";
	}
	
	@Override
	public Map<String, String> getPersonList() {
		
		Map<String,String> personMap = new HashMap<String,String>();
		personMap.put("PERSON-1", "Hans Müller");
		
		return personMap;
	}
	
	@Override
	public String getPersonFirstname(String personId) {
		return "Hans";
	}

	@Override
	public void setPersonFirstname(String personId,String firstname) {}

	@Override
	public String getPersonLastname(String personId) {
		return "Müller";
	}

	@Override
	public void setPersonLastname(String personId, String lastname) {}

	@Override
	public Date getPersonBirth(String personId) {
		return null;
	}

	@Override
	public void setPersonBirth(String personId, Date birth) {
	}

	@Override
	public Date getPersonRegistration(String personId) {
		return null;
	}

	@Override
	public void setPersonRegistration(String personId, Date registration) {
	}

	@Override
	public int getPersonAge(String personId) {
		return 0;
	}

	@Override
	public void setPersonAge(String personId, int age) {
	}

	@Override
	public String getPersonNationality(String personId) {
		return null;
	}

	@Override
	public void setPersonNationality(String personId, String nationality) {
	}

	@Override
	public String getPersonEmail(String personId) {
		return null;
	}

	@Override
	public void setPersonEmail(String personId, String email) {
	}

	@Override
	public String getPersonTelephone(String personId) {
		return null;
	}

	@Override
	public void setPersonTelephone(String personId, String telephone) {
	}

	@Override
	public String getPersonMobile(String personId) {
		return null;
	}

	@Override
	public void setPersonMobile(String personId, String mobile) {
	}

	@Override
	public String getPersonStreet(String personId) {
		return null;
	}

	@Override
	public void setPersonStreet(String personId, String street) {
	}

	@Override
	public int getPersonPostcode(String personId) {
		return 0;
	}

	@Override
	public void setPersonPostcode(String personId, int postcode) {
	}

	@Override
	public String getPersonCity(String personId) {
		return null;
	}

	@Override
	public void setPersonCity(String personId, String city) {
	}

	@Override
	public String getPersonCountry(String personId) {
		return null;
	}

	@Override
	public void setPersonCountry(String personId, String country) {
	}

	@Override
	public String getPersonString(String personId) {
		return null;
	}

}