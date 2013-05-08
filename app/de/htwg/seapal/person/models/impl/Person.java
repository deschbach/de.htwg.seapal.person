package de.htwg.seapal.person.models.impl;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import de.htwg.seapal.person.models.AbstractPerson;
import de.htwg.seapal.person.models.IPerson;

@Entity
public class Person extends AbstractPerson {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long internalId;

	private String firstname = "";

	private String lastname = "";

	private Date birth = new Date();

	private Date registration = new Date();

	private int age = 0;

	private String nationality = "";

	private String email = "";

	private String telephone = "";

	private String mobile = "";

	private String street = "";

	private int postcode = 0;

	private String city = "";

	private String country = "";

	public Person() {
	}
	
	public Person(long id) {
		this();
		this.internalId = id;
	}

	public Person(IPerson person) {
		int tIndex = person.getId().indexOf('-');
		if (tIndex == -1) {
			throw new IllegalArgumentException(
					"The person entity id must have the format PERSON-0. No - found.");
		}
		internalId = Long.parseLong(person.getId().substring(tIndex + 1));

		firstname = person.getFirstname();
		lastname = person.getLastname();
		birth = person.getBirth();
		registration = person.getRegistration();
		age = person.getAge();
		nationality = person.getNationality();

		email = person.getEmail();
		telephone = person.getTelephone();
		mobile = person.getMobile();

		street = person.getStreet();
		postcode = person.getPostcode();
		city = person.getCity();
		country = person.getCountry();
	}


	@Override
	public String getId() {
		return "PERSON-" + this.internalId;
	};
	
	public void setInternalId(long internalId) {
		this.internalId = internalId;
	}

	public long getInternalId() {
		return internalId;
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
}
