package app;
import models.IBoat;

import com.google.inject.AbstractModule;

import controllers.IBoatController;



public class BoatDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBoat.class).to(models.mock.Boat.class);
		bind(IBoatController.class).to(controllers.mock.BoatController.class);	
		
	}

}
