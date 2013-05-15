package de.htwg.seapal.person.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import play.api.Application;
import play.api.DefaultApplication;
import play.api.Mode;
import play.api.Play;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.person.controllers.IPersonController;
import de.htwg.seapal.person.views.tui.PersonTUI;

public final class PersonDemo {

	private PersonDemo() {
	}
	
	/**
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws NotBoundException 
	 */
	public static void main(String[] args) throws IOException, NotBoundException {
		
		Application play = new DefaultApplication(new File("."),
				PersonDemo.class.getClassLoader(), null, Mode.Dev());
		Play.start(play);
		
		System.setProperty("java.rmi.server.codebase", "file:C:\\Studium\\Webtech\\eclipse\\de.htwg.seapal.person\\target\\classes");
		
		// Set up Google Guice DI
		Injector injector = Guice.createInjector(new PersonDemoImplModule());
		
		// Build up the application, resolving dependencies automatically by Guice
		IPersonController controller = injector.getInstance(IPersonController.class);
		
		// create remote controller
		Registry localeReg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
		IPersonController controllerStub = (IPersonController) UnicastRemoteObject.exportObject(controller);
		localeReg.rebind("PersonController", controllerStub);

		// Get remote controller
		Registry registry = LocateRegistry.getRegistry();
		IPersonController remoteController = (IPersonController) registry.lookup("PersonController");
		
		
		PersonTUI tui = new PersonTUI(remoteController);
		tui.printTUI();
		
		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		while (continu) {
			continu = tui.processInputLine(br.readLine());
		}
		
		Play.stop();
	}

}
