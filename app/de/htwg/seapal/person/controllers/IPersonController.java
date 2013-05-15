package de.htwg.seapal.person.controllers;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Map;

import de.htwg.seapal.common.observer.IObservable;

public interface IPersonController extends IObservable, Remote {
	
	Map<String,String> getPersonList() throws RemoteException;
	
	String addPerson() throws RemoteException;
	
	String getPersonFirstname(String personId) throws RemoteException;
	void setPersonFirstname(String personId, String firstname) throws RemoteException;
	
	String getPersonLastname(String personId) throws RemoteException;
	void setPersonLastname(String personId, String lastname) throws RemoteException;
	
	Date getPersonBirth(String personId) throws RemoteException;
	void setPersonBirth(String personId, Date birth) throws RemoteException;
	
	Date getPersonRegistration(String personId) throws RemoteException;
	void setPersonRegistration(String personId, Date registration) throws RemoteException;
	
	int getPersonAge(String personId) throws RemoteException;
	void setPersonAge(String personId, int age) throws RemoteException;
	
	String getPersonNationality(String personId) throws RemoteException;
	void setPersonNationality(String personId, String nationality) throws RemoteException;
	
	String getPersonEmail(String personId) throws RemoteException;
	void setPersonEmail(String personId, String email) throws RemoteException;
	
	String getPersonTelephone(String personId) throws RemoteException;
	void setPersonTelephone(String personId, String telephone) throws RemoteException;
	
	String getPersonMobile(String personId) throws RemoteException;
	void setPersonMobile(String personId, String mobile) throws RemoteException;
	
	String getPersonStreet(String personId) throws RemoteException;
	void setPersonStreet(String personId, String street) throws RemoteException;
	
	int getPersonPostcode(String personId) throws RemoteException;
	void setPersonPostcode(String personId, int postcode) throws RemoteException;
	
	String getPersonCity(String personId) throws RemoteException;
	void setPersonCity(String personId, String city) throws RemoteException;
	
	String getPersonCountry(String personId) throws RemoteException;
	void setPersonCountry(String personId, String country) throws RemoteException;

	String getPersonString(String personId) throws RemoteException;
	
}
