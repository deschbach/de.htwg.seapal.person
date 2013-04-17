package de.htwg.seapal.person.controllers;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.Before;
import org.junit.Test;


import com.google.inject.Injector;

import de.htwg.seapal.person.controllers.IPersonController;

public abstract class IPersonControllerTest {

	private IPersonController sut;
	private String personTestId;
	
	// Set up Google Guice Dependency Injector
	Injector injector;
	
	protected abstract Injector createInjector();

	
	@Before
	public void setup() {
		// create injector in subclass
		injector = createInjector();
		// Build up the application, resolving dependencies automatically by Guice
		sut = injector.getInstance(IPersonController.class);
		
		personTestId = sut.addPerson();
	}
	

	@Test
	public void testGetPersonFirstname() {
		sut.setPersonFirstname(personTestId, "Max");
		assertEquals("Max", sut.getPersonFirstname(personTestId));
	}
	
	@Test
	public void testGetPersonLastname() {
		sut.setPersonLastname(personTestId, "Mustermann");
		assertEquals("Mustermann", sut.getPersonLastname(personTestId));
	}
	
	@Test
	public void testGetPersonBirth() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		try {
			date = dateFormat.parse("00.00.0000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sut.setPersonBirth(personTestId, date);
		assertEquals(date, sut.getPersonBirth(personTestId));
	}
	
	@Test
	public void testGetPersonRegistration() {
		Date date = null;
		try {
			date = (new SimpleDateFormat("dd.MM.yyyy")).parse("00.00.0000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sut.setPersonRegistration(personTestId, date);
		assertEquals(date, sut.getPersonRegistration(personTestId));
	}
	
	@Test
	public void testGetPersonAge() {
		sut.setPersonAge(personTestId, 50);
		assertEquals(50, sut.getPersonAge(personTestId));
	}
	
	@Test
	public void testGetPersonNationality() {
		sut.setPersonNationality(personTestId, "German");
		assertEquals("German", sut.getPersonNationality(personTestId));
	}
	
	@Test
	public void testGetPersonEmail() {
		sut.setPersonEmail(personTestId, "max.musterman@domain.de");
		assertEquals("max.musterman@domain.de", sut.getPersonEmail(personTestId));
	}
	
	@Test
	public void testGetPersonTelephone() {
		sut.setPersonTelephone(personTestId, "0123/4567890");
		assertEquals("0123/4567890", sut.getPersonTelephone(personTestId));
	}
	
	@Test
	public void testGetPersonMobile() {
		sut.setPersonMobile(personTestId, "0987/6543210");
		assertEquals("0987/6543210", sut.getPersonMobile(personTestId));
	}
	
	@Test
	public void testGetPersonStreet() {
		sut.setPersonStreet(personTestId, "Musterstraße 1");
		assertEquals("Musterstraße 1", sut.getPersonStreet(personTestId));
	}
	
	@Test
	public void testGetPersonPostcode() {
		sut.setPersonPostcode(personTestId, 12345);
		assertEquals(12345, sut.getPersonPostcode(personTestId));
	}
	
	@Test
	public void testGetPersonCity() {
		sut.setPersonCity(personTestId, "Musterstadt");
		assertEquals("Musterstadt", sut.getPersonCity(personTestId));
	}
	
	@Test
	public void testGetPersonCountry() {
		sut.setPersonCountry(personTestId, "Germany");
		assertEquals("Germany", sut.getPersonCountry(personTestId));
	}
	
}
