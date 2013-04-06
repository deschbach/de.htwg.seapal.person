package de.htwg.seapal.person.views.tui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import de.htwg.seapal.person.controllers.IPersonController;
import de.htwg.seapal.person.util.observer.Event;
import de.htwg.seapal.person.util.observer.IObserver;


public class PersonTUI implements IObserver {
	
	private IPersonController controller;

	public PersonTUI(IPersonController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}

	public void update(Event e) {
		printTUI();
	}

	public boolean processInputLine(String line) {
		
		boolean continu = true;
		
		Date date = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		
		char command = line.charAt(0);
		
		Scanner scanner = new Scanner(System.in);
		
		switch (command) {
		
			case 'q':
				continu = false;
				break;
			
			case 'f':
				System.out.println("Firstname: ");
				controller.setPersonFirstname(scanner.next());
				break;
				
			case 'l':
				System.out.println("Lastname: ");
				controller.setPersonLastname(scanner.next());
				break;
				
			case 'b':
				System.out.println("Birth (dd.mm.yyyy): ");
								
				try {
					date = dateFormat.parse(scanner.next());
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				controller.setPersonBirth(date);
				break;
				
			case 'a':
				System.out.println("Age: ");
				controller.setPersonAge(Integer.valueOf(scanner.next()).intValue());
				break;
				
			case 'r':
				System.out.println("Registration (dd.mm.yyyy): ");
				
				try {
					date = dateFormat.parse(scanner.next());
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				controller.setPersonRegistration(date);
				
				break;
	
			case 'n':
				System.out.println("Nationality: ");
				controller.setPersonNationality(scanner.next());
				break;
				
			case 'e':
				System.out.println("Email: ");
				controller.setPersonEmail(scanner.next());
				break;
				
			case 't':
				System.out.println("Telephone: ");
				controller.setPersonTelephone(scanner.next());
				break;
				
			case 'm':
				System.out.println("Mobile: ");
				controller.setPersonMobile(scanner.next());
				break;
				
			case 's':
				System.out.println("Street: ");
				controller.setPersonStreet(scanner.nextLine());
				break;
				
			case 'p':
				System.out.println("Postcode: ");
				controller.setPersonPostcode(Integer.valueOf(scanner.next()).intValue());
				break;
				
			case 'c':
				System.out.println("City: ");
				controller.setPersonCity(scanner.next());
				break;
				
			case 'o':
				System.out.println("Country: ");
				controller.setPersonCountry(scanner.next());
				break;
				
			default:
				System.out.println("Unknown Command! Pleas try again ...");
			
		}
		
		return continu;
	}
	
	public void printTUI() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("PersonDemo: ").append("\n");
		sb.append("f - set Firstname").append("\n");
		sb.append("l - set Lastname").append("\n");
		sb.append("b - set Birth").append("\n");
		sb.append("r - set Registration").append("\n");
		sb.append("a - set Age").append("\n");
		sb.append("n - set Nationality").append("\n");
		sb.append("e - set Email").append("\n");
		sb.append("t - set Telephone").append("\n");
		sb.append("m - set Mobile").append("\n");
		sb.append("s - set Street").append("\n");
		sb.append("p - set Postcode").append("\n");
		sb.append("c - set City").append("\n");
		sb.append("o - set Country").append("\n");
		sb.append("\n");
		sb.append(controller.getPersonString());
		sb.append("\n");
		sb.append("Command: ");
		
		System.out.print(sb.toString());
	}

}
