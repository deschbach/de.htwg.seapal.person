package controllers.mock;

import com.google.inject.Inject;

import controllers.IPersonController;
import util.observer.Observable;
import models.IPerson;

public class PersonController extends Observable implements IPersonController{
	
	private IPerson person;

	@Inject
	public PersonController(IPerson person) {
		this.person = person;
	}

	@Override
	public void setBoatName(String string) {
		person.setName(string);
		notifyObservers();
	}
	
	@Override
	public String getString() {
		return "Boat: " + person.getName();
	}

	@Override
	public String getBoatName() {
		return person.getName();
	}

}
