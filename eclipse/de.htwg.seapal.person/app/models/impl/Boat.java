package models.impl;

import models.IBoat;

public class Boat implements IBoat{

	private String name="n.a.";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
