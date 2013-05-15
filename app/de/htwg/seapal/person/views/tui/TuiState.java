package de.htwg.seapal.person.views.tui;

import java.rmi.RemoteException;
import java.util.Scanner;

interface TuiState {
	TuiState processInput(String input);
}

interface TuiCommand {
	String getDescription();
}

interface TuiEditAttributeCommand extends TuiCommand {
	TuiState execute(String personId, String value) throws RemoteException;
}

interface MenuTuiCommand extends TuiCommand {
	TuiState execute(Scanner arguments) throws RemoteException;
}