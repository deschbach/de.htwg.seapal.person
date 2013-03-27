package controllers.mock;

import com.google.inject.Inject;

import controllers.IBoatController;
import util.observer.Observable;
import models.IBoat;

public class BoatController extends Observable implements IBoatController{
	
	private IBoat boat;

	@Inject
	public BoatController(IBoat boat) {
		this.boat = boat;
	}

	@Override
	public void setBoatName(String string) {
		boat.setName(string);
		notifyObservers();
	}
	
	@Override
	public String getString() {
		return "Boat: " + boat.getName();
	}

	@Override
	public String getBoatName() {
		return boat.getName();
	}

}
