package models.impl;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	private Person person;
	
	@Before
	public void setup() {
		person = new Person();
	}

	@Test
	public void testGetFirstname() {
		person.setFirstname("Max");
		assertEquals("Max", person.getFirstname());
	}
	
	@Test
	public void testGetLastname() {
		person.setLastname("Mustermann");
		assertEquals("Mustermann", person.getLastname());
	}
	
	@Test
	public void testGetBirth() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		try {
			date = dateFormat.parse("00.00.0000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		person.setBirth(date);
		assertEquals(date, person.getRegistration());
	}
	
	@Test
	public void testGetRegistration() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		try {
			date = dateFormat.parse("00.00.0000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		person.setRegistration(date);
		assertEquals(date, person.getRegistration());
	}
	
	@Test
	public void testGetAge() {
		person.setAge(50);
		assertEquals(50, person.getAge());
	}
	
	@Test
	public void testGetNationality() {
		person.setNationality("German");
		assertEquals("German", person.getNationality());
	}
	
	@Test
	public void testGetEmail() {
		person.setEmail("max.musterman@domain.de");
		assertEquals("max.musterman@domain.de", person.getEmail());
	}
	
	@Test
	public void testGetTelephone() {
		person.setTelephone("0123/4567890");
		assertEquals("0123/4567890", person.getTelephone());
	}
	
	@Test
	public void testGetMobile() {
		person.setMobile("0987/6543210");
		assertEquals("0987/6543210", person.getMobile());
	}
	
	@Test
	public void testGetStreet() {
		person.setStreet("Musterstraße 1");
		assertEquals("Musterstraße 1", person.getStreet());
	}
	
	@Test
	public void testGetPostcode() {
		person.setPostcode(12345);
		assertEquals(12345, person.getPostcode());
	}
	
	@Test
	public void testGetCity() {
		person.setCity("Musterstadt");
		assertEquals("Musterstadt", person.getCity());
	}
	
	@Test
	public void testGetCountry() {
		person.setCountry("Germany");
		assertEquals("Germany", person.getCountry());
	}

}
