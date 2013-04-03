package de.htwg.seapal.person.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.person.controllers.IPersonController;
import de.htwg.seapal.person.models.IPerson;



public class PersonDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(de.htwg.seapal.person.models.mock.Person.class);
		bind(IPersonController.class).to(de.htwg.seapal.person.controllers.mock.PersonController.class);	
		
	}

}
