package de.htwg.seapal.person.models;

import java.text.SimpleDateFormat;

public abstract class AbstractPerson implements IPerson {

	public String getString() {
		
		StringBuilder sb = new StringBuilder();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		
		sb.append("\n");
		sb.append("ID: \t\t").append(this.getId()).append("\n");
		sb.append("Firstname: \t").append(this.getFirstname()).append("\n");
		sb.append("Lastname: \t").append(this.getLastname()).append("\n");
		sb.append("Birth: \t\t").append(dateFormat.format(this.getBirth())).append("\n");
		sb.append("Registration: \t").append(dateFormat.format(this.getRegistration())).append("\n");
		sb.append("Age: \t\t").append(this.getAge()).append("\n");
		sb.append("Nationality: \t").append(this.getNationality()).append("\n");
		sb.append("Email: \t\t").append(this.getEmail()).append("\n");
		sb.append("Telephone: \t").append(this.getTelephone()).append("\n");
		sb.append("Mobile: \t").append(this.getMobile()).append("\n");
		sb.append("Street: \t").append(this.getStreet()).append("\n");
		sb.append("Postcode: \t").append(this.getPostcode()).append("\n");
		sb.append("City: \t\t").append(this.getCity()).append("\n");
		sb.append("Country: \t").append(this.getCountry()).append("\n");
		sb.append("\n");
		
		return sb.toString();
	}
}
