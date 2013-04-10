package de.htwg.seapal.person.controllers;

import java.util.Date;
import java.util.Map;

import de.htwg.seapal.person.util.observer.IObservable;

public interface IPersonController extends IObservable{
	
	Map<String,String> getPersonList();
	
	String getPersonFirstname(String personId);
	void setPersonFirstname(String personId, String firstname);
	
	String getPersonLastname(String personId);
	void setPersonLastname(String personId, String lastname);
	
	Date getPersonBirth();
	void setPersonBirth(Date birth);
	
	Date getPersonRegistration();
	void setPersonRegistration(Date registration);
	
	int getPersonAge();
	void setPersonAge(int age);
	
	String getPersonNationality();
	void setPersonNationality(String nationality);
	
	String getPersonEmail();
	void setPersonEmail(String email);
	
	String getPersonTelephone();
	void setPersonTelephone(String telephone);
	
	String getPersonMobile();
	void setPersonMobile(String mobile);
	
	String getPersonStreet();
	void setPersonStreet(String street);
	
	int getPersonPostcode();
	void setPersonPostcode(int postcode);
	
	String getPersonCity();
	void setPersonCity(String city);
	
	String getPersonCountry();
	void setPersonCountry(String country);

	String getPersonString();
	
}
