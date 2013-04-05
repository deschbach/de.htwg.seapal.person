package de.htwg.seapal.person.models;

import java.util.Date;

public interface IPerson {
	
	String getFirstname();
	void setFirstname(String firstname);
	
	String getLastname();
	void setLastname(String lastname);
	
	Date getBirth();
	void setBirth(Date birth);
	
	Date getRegistration();
	void setRegistration(Date registration);
	
	int getAge();
	void setAge(int age);
	
	String getNationality();
	void setNationality(String nationality);
	
	String getEmail();
	void setEmail(String email);
	
	String getTelephone();
	void setTelephone(String telephone);
	
	String getMobile();
	void setMobile(String mobile);
	
	String getStreet();
	void setStreet(String street);
	
	int getPostcode();
	void setPostcode(int postcode);
	
	String getCity();
	void setCity(String city);
	
	String getCountry();
	void setCountry(String country);
	
	String getString();
	
}
