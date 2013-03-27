package models.impl;

import models.IPerson;

public class Person implements IPerson{

	private String name="n.a.";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
