package de.htwg.seapal.person.controllers.mock;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.controllers.AbstractPersonController;

@Singleton
public class PersonController extends AbstractPersonController {
	
	@Inject
	public PersonController(IPerson person) {
		this.person = person;
	}

}