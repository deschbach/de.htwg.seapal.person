package de.htwg.seapal.person.controllers;

import play.*;
import play.mvc.*;

import views.html.*;

@SuppressWarnings("unused")
public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
  
}
