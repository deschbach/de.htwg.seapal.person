package de.htwg.seapal.person.controllers.mock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.htwg.seapal.person.controllers.IPersonController;
import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.common.observer.Observable;

@Singleton
public class PersonController extends Observable implements IPersonController {
	
	private static final int AGE = 50;
	private static final int POSTCODE = 12345;
	private static final String FIRSTNAME = "Max";
	private static final String LASTNAME = "Mustermann";
	private static final String PERSONID = "PERSON-0";
	private static final String NATIONALITY = "German";
	private static final String EMAIL = "max.musterman@domain.de";
	private static final String PHONE = "0123/4567890";
	private static final String MOBILE = "0987/6543210";
	private static final String STREET = "Musterstraße 1";
	private static final String CITY = "Musterstadt";
	private static final String COUNTRY = "Germany";
	
	private static Date someDate;
	
	static {
		try {
			someDate = (new SimpleDateFormat("dd.MM.yyyy")).parse("00.00.0000");
		} catch (ParseException e) {
			someDate = null;
		}
	}
	
	@Inject
	private IBoatController boatController;
	
	@Override
	public String addPerson() {
		return PERSONID;
	}
	
	@Override
	public Map<String, String> getPersonList() {
		
		Map<String,String> personMap = new HashMap<String,String>();
		personMap.put(PERSONID, FIRSTNAME + " " + LASTNAME);
		
		return personMap;
	}
	
	
	@Override
	public String getPersonFirstname(String personId) {
		return FIRSTNAME;
	}
	
	public void setPersonFirstname(String personId, String firstname) {
	}
	
	public String getPersonLastname(String personId) {
		return LASTNAME;
	}
	
	public void setPersonLastname(String personId, String lastname) {
	}
	
	public Date getPersonBirth(String personId) {
		return someDate;
	}
	
	public void setPersonBirth(String personId, Date birth) {
	}
	
	public Date getPersonRegistration(String personId) {
		return someDate;
	}

	public void setPersonRegistration(String personId, Date registration) {
	}
	
	public int getPersonAge(String personId) {
		return AGE;
	}
	
	public void setPersonAge(String personId, int age) {
	}
	
	public String getPersonNationality(String personId) {
		return NATIONALITY;
	}

	public void setPersonNationality(String personId, String nationality) {
	}
	
	public String getPersonEmail(String personId) {
		return EMAIL;
	}
	
	public void setPersonEmail(String personId, String email) {
	}
	
	public String getPersonTelephone(String personId) {
		return PHONE;
	}
	
	public void setPersonTelephone(String personId, String telephone) {
	}
	
	public String getPersonMobile(String personId) {
		return MOBILE;
	}
	
	public void setPersonMobile(String personId, String mobile) {
	}
	
	public String getPersonStreet(String personId) {
		return STREET;
	}
	
	public void setPersonStreet(String personId, String street) {
	}
	
	public int getPersonPostcode(String personId) {
		return POSTCODE;
	}
	
	public void setPersonPostcode(String personId, int postcode) {
	}
	
	public String getPersonCity(String personId) {
		return CITY;
	}
	
	public void setPersonCity(String personId, String city) {
	}
	
	public String getPersonCountry(String personId) {
		return COUNTRY;
	}
	
	public void setPersonCountry(String personId, String country) {
	}	
	
	@Override
	public String getPersonString(String personId) {
		return null;
	}

	@Override
	public Map<String, String> getPersonBoats(String personId) {
		return null;
	}

	@Override
	public String getPersonBoatsString(String personId) {
		return null;
	}

}