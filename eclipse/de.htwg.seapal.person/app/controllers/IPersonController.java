package controllers;

import util.observer.IObservable;

public interface IPersonController extends IObservable{

	void setBoatName(String string);
	
	String getBoatName();

	String getString();

}
