package de.htwg.seapal.person.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.person.controllers.IPersonController;
import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.database.IPersonDatabase;

public class PersonDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(de.htwg.seapal.person.models.impl.Person.class);
		bind(IPersonController.class).to(de.htwg.seapal.person.controllers.impl.PersonController.class);	
		bind(IPersonDatabase.class).to(de.htwg.seapal.person.database.impl.PersonDb4oDatabase.class);
		bind(IBoatController.class).to(de.htwg.seapal.boat.controllers.mock.BoatController.class);
		bind(IBoat.class).to(de.htwg.seapal.boat.models.mock.Boat.class);
	}

}