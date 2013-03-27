package views.tui;

import java.util.Scanner;

import controllers.IPersonController;
import util.observer.Event;
import util.observer.IObserver;


public class PersonTUI implements IObserver{
	
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
		if (line.equalsIgnoreCase("q")) {
			continu = false;
		}
		if (line.equalsIgnoreCase("n")) {
			Scanner scanner = new Scanner(System.in);
			controller.setBoatName(scanner.next());
		}
		return continu;
	}
	
	public void printTUI() {
		System.out.println("BoatDemo: n - new Name");
		System.out.println(controller.getString());
		
	}

}
