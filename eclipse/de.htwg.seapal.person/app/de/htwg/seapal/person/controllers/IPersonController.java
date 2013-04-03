package de.htwg.seapal.person.controllers;

import java.util.Date;

import de.htwg.seapal.person.util.observer.IObservable;


public interface IPersonController extends IObservable{
	
	String getPersonFirstname();
	void setPersonFirstname(String firstname);
	
	String getPersonLastname();
	void setPersonLastname(String lastname);
	
	public Date getPersonBirth();
	void setPersonBirth(Date birth);
	
	public Date getPersonRegistration();
	void setPersonRegistration(Date registration);
	
	int getPersonAge();
	void setPersonAge(int age);
	
	String getPersonNationality();
	void setPersonNationality(String nationality);
	
	public String getPersonEmail();
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
