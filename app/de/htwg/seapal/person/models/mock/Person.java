package de.htwg.seapal.person.models.mock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import de.htwg.seapal.person.models.AbstractPerson;

public class Person extends AbstractPerson {
	
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
	
	public String getId() {
		return PERSONID;
	}
	
	
	public String getFirstname() {
		return FIRSTNAME;
	}
	
	public void setFirstname(String firstname) {
	}
	
	public String getLastname() {
		return LASTNAME;
	}
	
	public void setLastname(String lastname) {
	}
	
	public Date getBirth() {
		return someDate;
	}
	
	public void setBirth(Date birth) {
	}
	
	public Date getRegistration() {
		return someDate;
	}

	public void setRegistration(Date registration) {
	}
	
	public int getAge() {
		return AGE;
	}
	
	public void setAge(int age) {
	}
	
	public String getNationality() {
		return NATIONALITY;
	}

	public void setNationality(String nationality) {
	}
	
	public String getEmail() {
		return EMAIL;
	}
	
	public void setEmail(String email) {
	}
	
	public String getTelephone() {
		return PHONE;
	}
	
	public void setTelephone(String telephone) {
	}
	
	public String getMobile() {
		return MOBILE;
	}
	
	public void setMobile(String mobile) {
	}
	
	public String getStreet() {
		return STREET;
	}
	
	public void setStreet(String street) {
	}
	
	public int getPostcode() {
		return POSTCODE;
	}
	
	public void setPostcode(int postcode) {
	}
	
	public String getCity() {
		return CITY;
	}
	
	public void setCity(String city) {
	}
	
	public String getCountry() {
		return COUNTRY;
	}
	
	public void setCountry(String country) {
	}	
}
