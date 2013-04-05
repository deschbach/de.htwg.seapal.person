package de.htwg.seapal.person.controllers;

import java.util.Date;
import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.util.observer.Observable;

public abstract class AbstractPersonController extends Observable implements IPersonController {

	protected IPerson person;
	
	@Override
	public String getPersonFirstname() {
		return person.getFirstname();
	}

	@Override
	public void setPersonFirstname(String firstname) {
		person.setFirstname(firstname);
		notifyObservers();
	}

	@Override
	public String getPersonLastname() {
		return person.getLastname();
	}

	@Override
	public void setPersonLastname(String lastname) {
		person.setLastname(lastname);
		notifyObservers();
	}

	@Override
	public Date getPersonBirth() {
		return person.getBirth();
	}

	@Override
	public void setPersonBirth(Date birth) {
		person.setBirth(birth);
		notifyObservers();
	}
	
	@Override
	public Date getPersonRegistration() {
		return person.getRegistration();
	}

	@Override
	public void setPersonRegistration(Date registration) {
		person.setRegistration(registration);
		notifyObservers();
	}

	@Override
	public int getPersonAge() {
		return person.getAge();
	}

	@Override
	public void setPersonAge(int age) {
		person.setAge(age);
		notifyObservers();
	}

	@Override
	public String getPersonNationality() {
		return person.getNationality();
	}

	@Override
	public void setPersonNationality(String nationality) {
		person.setNationality(nationality);
		notifyObservers();
	}
	
	@Override
	public String getPersonEmail() {
		return person.getEmail();
	}

	@Override
	public void setPersonEmail(String email) {
		person.setEmail(email);
		notifyObservers();
	}

	@Override
	public String getPersonTelephone() {
		return person.getTelephone();
	}

	@Override
	public void setPersonTelephone(String telephone) {
		person.setTelephone(telephone);
		notifyObservers();
	}

	@Override
	public String getPersonMobile() {
		return person.getMobile();
	}

	@Override
	public void setPersonMobile(String mobile) {
		person.setMobile(mobile);
		notifyObservers();
	}

	@Override
	public String getPersonStreet() {
		return person.getStreet();
	}

	@Override
	public void setPersonStreet(String street) {
		person.setStreet(street);
		notifyObservers();
	}

	@Override
	public int getPersonPostcode() {
		return person.getPostcode();
	}

	@Override
	public void setPersonPostcode(int postcode) {
		person.setPostcode(postcode);
		notifyObservers();
	}

	@Override
	public String getPersonCity() {
		return person.getCity();
	}

	@Override
	public void setPersonCity(String city) {
		person.setCity(city);
		notifyObservers();
	}

	@Override
	public String getPersonCountry() {
		return person.getCountry();
	}

	@Override
	public void setPersonCountry(String country) {
		person.setCountry(country);
		notifyObservers();
	}
	
	@Override
	public String getPersonString() {
		return person.getString();
	}

}