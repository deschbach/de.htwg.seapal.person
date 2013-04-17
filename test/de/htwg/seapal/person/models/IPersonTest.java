package de.htwg.seapal.person.models;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

public abstract class IPersonTest {

	private IPerson sut;
	
	// Set up Google Guice Dependency Injector
	Injector injector;
	
	protected abstract Injector createInjector();

	
	@Before
	public void setup() {
		// create injector in subclass
		injector = createInjector();
		// Build up the application, resolving dependencies automatically by Guice
		sut = injector.getInstance(IPerson.class);
	}

	@Test
	public void testGetFirstname() {
		sut.setFirstname("Max");
		assertEquals("Max", sut.getFirstname());
	}
	
	@Test
	public void testGetLastname() {
		sut.setLastname("Mustermann");
		assertEquals("Mustermann", sut.getLastname());
	}
	
	@Test
	public void testGetAge() {
		sut.setAge(50);
		assertEquals(50, sut.getAge());
	}
	
	@Test
	public void testGetNationality() {
		sut.setNationality("German");
		assertEquals("German", sut.getNationality());
	}
	
	@Test
	public void testGetEmail() {
		sut.setEmail("max.musterman@domain.de");
		assertEquals("max.musterman@domain.de", sut.getEmail());
	}
	
	@Test
	public void testGetTelephone() {
		sut.setTelephone("0123/4567890");
		assertEquals("0123/4567890", sut.getTelephone());
	}
	
	@Test
	public void testGetMobile() {
		sut.setMobile("0987/6543210");
		assertEquals("0987/6543210", sut.getMobile());
	}
	
	@Test
	public void testGetStreet() {
		sut.setStreet("Musterstraße 1");
		assertEquals("Musterstraße 1", sut.getStreet());
	}
	
	@Test
	public void testGetPostcode() {
		sut.setPostcode(12345);
		assertEquals(12345, sut.getPostcode());
	}
	
	@Test
	public void testGetCity() {
		sut.setCity("Musterstadt");
		assertEquals("Musterstadt", sut.getCity());
	}
	
	@Test
	public void testGetCountry() {
		sut.setCountry("Germany");
		assertEquals("Germany", sut.getCountry());
	}

}
