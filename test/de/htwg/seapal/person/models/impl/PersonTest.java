package de.htwg.seapal.person.models.impl;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.person.controllers.IPersonController;
import de.htwg.seapal.person.database.IPersonDatabase;
import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.person.models.IPersonTest;

public class PersonTest extends IPersonTest {

	@Override
	protected Injector createInjector() {
		Injector tInj = Guice.createInjector(new AbstractModule() {

			@Override
			protected void configure() {
				bind(IPerson.class).to(
						de.htwg.seapal.person.models.impl.Person.class);
				bind(IPersonController.class)
						.to(de.htwg.seapal.person.controllers.mock.PersonController.class);
				bind(IPersonDatabase.class)
						.to(de.htwg.seapal.person.database.mock.PersonDatabase.class);
				bind(IBoatController.class).to(de.htwg.seapal.boat.controllers.mock.BoatController.class);
				bind(IBoat.class).to(de.htwg.seapal.boat.models.mock.Boat.class);
			}
		});
		return tInj;
	}

}
