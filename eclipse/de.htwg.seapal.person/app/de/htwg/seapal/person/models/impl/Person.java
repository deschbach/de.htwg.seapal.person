package de.htwg.seapal.person.models.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import de.htwg.seapal.person.models.IPerson;


public class Person implements IPerson{

	private String firstname = null;
	private String lastname= null;

	private Date birth;
	private Date registration;
	private int age = 0;
	private String nationality = null;
	
	private String email = null;
	private String telephone = null;
	private String mobile = null;
	
	private String street = null;
	private int postcode = 0;
	private String city = null;
	private String country = null;
	
	public Person() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		try {
			this.birth = dateFormat.parse("00.00.0000");
			this.registration = dateFormat.parse("00.00.0000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Date getBirth() {
		return birth;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public Date getRegistration() {
		return registration;
	}

	public void setRegistration(Date registration) {
		this.registration = registration;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public int getPostcode() {
		return postcode;
	}
	
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
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
