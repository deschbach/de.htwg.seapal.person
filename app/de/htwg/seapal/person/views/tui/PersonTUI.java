package de.htwg.seapal.person.views.tui;

import java.io.PrintStream;

import com.google.inject.Inject;

import de.htwg.seapal.common.observer.Event;
import de.htwg.seapal.common.observer.IObserver;
import de.htwg.seapal.common.plugin.Plugin;
import de.htwg.seapal.person.controllers.IPersonController;

public class PersonTUI implements IObserver, Plugin {

	private TuiState tuiState;
	
	private PrintStream consoleUi = System.out;
	 

	@Inject
	public PersonTUI(IPersonController controller) {
		controller.addObserver(this);
		tuiState = new MenuTuiState(controller);
	}

	@Override
	public void update(Event e) {
		consoleUi.println("updated");
	}

	@Override
	public boolean processInputLine(String line) {
		tuiState = tuiState.processInput(line);
		if (tuiState == null) {
			return false;
		}
		return true;
	}

	@Override
	public void printTUI() {
		consoleUi.printf("%nCommand (h for help): ");
	}

	@Override
	public String getMenuEntry() {
		return "Person";
	}

	@Override
	public char getMenuKey() {
		return 'p';
	}

}
