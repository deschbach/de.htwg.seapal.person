package app;

import java.util.Scanner;

import com.google.inject.Guice;
import com.google.inject.Injector;

import views.tui.BoatTUI;
import controllers.IBoatController;


public class BoatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Set up Google Guice Dependency Injector
		Injector injector = Guice.createInjector(new BoatDemoImplModule());
		
		// Build up the application, resolving dependencies automatically by Guice
		IBoatController controller = injector.getInstance(IBoatController.class);

		BoatTUI tui = new BoatTUI(controller);

		tui.printTUI();
		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;
		Scanner scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.next());
		}

	}

}
