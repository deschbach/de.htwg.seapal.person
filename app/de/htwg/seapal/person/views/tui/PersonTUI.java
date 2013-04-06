package de.htwg.seapal.person.views.tui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import de.htwg.util.plugin.Plugin;
import de.htwg.seapal.person.controllers.IPersonController;
import de.htwg.seapal.person.util.observer.Event;
import de.htwg.seapal.person.util.observer.IObserver;


public class PersonTUI implements IObserver, Plugin {
	
	private IPersonController controller;

	public PersonTUI(IPersonController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}

	@Override
	public void update(Event e) {
		printTUI();
	}

	@Override
	public boolean processInputLine(String line) {
		
		boolean continu = true;
		
		char command = line.charAt(0);
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		switch (command) {
		
			case 'q':
				continu = false;
				break;
			
			case 'f':
				controller.setPersonFirstname(scanner.next());
				break;
				
			case 'l':
				controller.setPersonLastname(scanner.next());
				break;
				
			case 'b':
				controller.setPersonBirth(parseDate(scanner.next()));
				break;
				
			case 'a':
				controller.setPersonAge(Integer.valueOf(scanner.next()).intValue());
				break;
				
			case 'r':
				controller.setPersonRegistration(parseDate(scanner.next()));
				break;
	
			case 'n':
				controller.setPersonNationality(scanner.next());
				break;
				
			case 'e':
				controller.setPersonEmail(scanner.next());
				break;
				
			case 't':
				controller.setPersonTelephone(scanner.next());
				break;
				
			case 'm':
				controller.setPersonMobile(scanner.next());
				break;
				
			case 's':
				controller.setPersonStreet(scanner.nextLine());
				break;
				
			case 'p':
				controller.setPersonPostcode(Integer.valueOf(scanner.next()).intValue());
				break;
				
			case 'c':
				controller.setPersonCity(scanner.next());
				break;
				
			case 'o':
				controller.setPersonCountry(scanner.next());
				break;
				
			default:
				System.out.println("Unknown Command! Pleas try again ...");
		}
		
		return continu;
	}
	
	@Override
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

	@Override
	public String getMenuEntry() {
		return "Person";
	}

	@Override
	public char getMenuKey() {
		return 'p';
	}
	
	private Date parseDate(String input) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		
		Date date = null;
		
		try {
			date = dateFormat.parse(input);
		} catch (ParseException e) {
			date = new Date();
		}
		
		return date;
	}

}
