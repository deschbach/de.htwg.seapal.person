package app;
import models.IPerson;

import com.google.inject.AbstractModule;

import controllers.IPersonController;



public class PersonDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(models.impl.Person.class);
		bind(IPersonController.class).to(controllers.impl.PersonController.class);	
		
	}

}
