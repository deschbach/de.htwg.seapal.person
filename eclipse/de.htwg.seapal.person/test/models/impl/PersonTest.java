package models.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	private Person person;
	
	@Before
	public void setup() {
		person = new Person();
	}

	@Test
	public void testGetName() {
		person.setFirstname("Xpresso");
		assertEquals("Xpresso", person.getFirstname());
	}

}
