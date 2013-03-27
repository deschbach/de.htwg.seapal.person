package app;
import models.IPerson;

import com.google.inject.AbstractModule;

import controllers.IPersonController;



public class PersonDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(models.mock.Person.class);
		bind(IPersonController.class).to(controllers.mock.PersonController.class);	
		
	}

}
