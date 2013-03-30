package models.mock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		try {
			date = dateFormat.parse("00.00.0000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public void setBirth(Date birth) {
	}
	
	public Date getRegistration() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		try {
			date = dateFormat.parse("00.00.0000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
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
	
	@Override
	public String getString() {
		
		StringBuilder sb = new StringBuilder();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		
		sb.append("Firstname: \t").append(this.getFirstname()).append("\n");
		sb.append("Lastname: \t").append(this.getLastname()).append("\n");
		sb.append("Birth: \t\t").append(dateFormat.format(this.getBirth())).append("\n");
		sb.append("Registration: \t").append(dateFormat.format(this.getRegistration())).append("\n");
		sb.append("Age: \t\t").append(this.getAge()).append("\n");
		sb.append("Nationality: \t").append(this.getNationality()).append("\n");
		sb.append("Email: \t\t").append(this.getEmail()).append("\n");
		sb.append("Telephone: \t").append(this.getTelephone()).append("\n");
		sb.append("Mobile: \t").append(this.getMobile()).append("\n");
		sb.append("Street: \t").append(this.getStreet()).append("\n");
		sb.append("Postcode: \t").append(this.getPostcode()).append("\n");
		sb.append("City: \t\t").append(this.getCity()).append("\n");
		sb.append("Country: \t").append(this.getCountry()).append("\n");
		
		return sb.toString();
	}
	
}
