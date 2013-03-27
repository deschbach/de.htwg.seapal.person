package controllers;

import util.observer.IObservable;

public interface IBoatController extends IObservable{

	void setBoatName(String string);
	
	String getBoatName();

	String getString();

}
