package de.htwg.seapal.person.models.mock;

import java.util.Date;

import de.htwg.seapal.person.models.AbstractPerson;

public class Person extends AbstractPerson {
	
	public String getFirstname() {
		return "Max";
	}
	
	public void setFirstname(String firstname) {
	}
	
	public String getLastname() {
		return "Mustermann";
	}
	
	public void setLastname(String lastname) {
	}
	
	public Date getBirth() {
		return new Date();
	}
	
	public void setBirth(Date birth) {
	}
	
	public Date getRegistration() {
		return new Date();
	}

	public void setRegistration(Date registration) {
	}
	
	public int getAge() {
		return 50;
	}
	
	public void setAge(int age) {
	}
	
	public String getNationality() {
		return "German";
	}

	public void setNationality(String nationality) {
	}
	
	public String getEmail() {
		return "max.musterman@domain.de";
	}
	
	public void setEmail(String email) {
	}
	
	public String getTelephone() {
		return "0123/4567890";
	}
	
	public void setTelephone(String telephone) {
	}
	
	public String getMobile() {
		return "0987/6543210";
	}
	
	public void setMobile(String mobile) {
	}
	
	public String getStreet() {
		return "Musterstraße 1";
	}
	
	public void setStreet(String street) {
	}
	
	public int getPostcode() {
		return 12345;
	}
	
	public void setPostcode(int postcode) {
	}
	
	public String getCity() {
		return "Musterstadt";
	}
	
	public void setCity(String city) {
	}
	
	public String getCountry() {
		return "Germany";
	}
	
	public void setCountry(String country) {
	}
	
}
