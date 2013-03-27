package app;
import models.IBoat;

import com.google.inject.AbstractModule;

import controllers.IBoatController;



public class BoatDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBoat.class).to(models.impl.Boat.class);
		bind(IBoatController.class).to(controllers.impl.BoatController.class);	
		
	}

}
