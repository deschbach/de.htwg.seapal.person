package models.mock;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoatTest {
	
	private Boat boat;

	@Before
	public void setup(){
		boat = new Boat();	
	}

	@Test
	public void testGetName() {
		assertEquals("Titanic", boat.getName());
	}

}
