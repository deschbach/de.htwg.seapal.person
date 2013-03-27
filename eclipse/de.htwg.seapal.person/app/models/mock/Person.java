package models.mock;

import java.util.Date;
import models.IPerson;

public class Person implements IPerson{
	
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
	
	public int getAge() {
		return 50;
	}
	
	public void setAge(int age) {
	}
	
	public String getEmail() {
		return "Max.Mustermann@domain.com";
	}
	
	public void setEmail(String email) {
	}
	
	public String getTelephone() {
		return "1234/56789";
	}
	
	public void setTelephone(String telephone) {
	}
	
	public String getMobile() {
		return "9876/54321";
	}
	
	public void setMobile(String mobile) {
	}
	
	public String getStreet() {
		return "Parkerstreet 12";
	}
	
	public void setStreet(String street) {
	}
	
	public int getPostcode() {
		return 12345;
	}
	
	public void setPostcode(int postcode) {
	}
	
	public String getCity() {
		return "London";
	}
	
	public void setCity(String city) {
	}
	
	public String getCountry() {
		return "England";
	}
	
	public void setCountry(String country) {
	}
	
}
