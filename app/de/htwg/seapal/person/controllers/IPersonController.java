package de.htwg.seapal.person.controllers;

import java.rmi.Remote;
import java.util.Date;
import java.util.Map;

import de.htwg.seapal.common.observer.IObservable;

public interface IPersonController extends IObservable, Remote {
	
	Map<String,String> getPersonList();
	
	String addPerson();
	
	String getPersonFirstname(String personId);
	void setPersonFirstname(String personId, String firstname);
	
	String getPersonLastname(String personId);
	void setPersonLastname(String personId, String lastname);
	
	Date getPersonBirth(String personId);
	void setPersonBirth(String personId, Date birth);
	
	Date getPersonRegistration(String personId);
	void setPersonRegistration(String personId, Date registration);
	
	int getPersonAge(String personId);
	void setPersonAge(String personId, int age);
	
	String getPersonNationality(String personId);
	void setPersonNationality(String personId, String nationality);
	
	String getPersonEmail(String personId);
	void setPersonEmail(String personId, String email);
	
	String getPersonTelephone(String personId);
	void setPersonTelephone(String personId, String telephone);
	
	String getPersonMobile(String personId);
	void setPersonMobile(String personId, String mobile);
	
	String getPersonStreet(String personId);
	void setPersonStreet(String personId, String street);
	
	int getPersonPostcode(String personId);
	void setPersonPostcode(String personId, int postcode);
	
	String getPersonCity(String personId);
	void setPersonCity(String personId, String city);
	
	String getPersonCountry(String personId);
	void setPersonCountry(String personId, String country);

	String getPersonString(String personId);
	
}
