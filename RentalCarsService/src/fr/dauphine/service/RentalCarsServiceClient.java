package fr.dauphine.service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import fr.dauphine.service.Garage;
import fr.dauphine.service.GarageImpl;

public class RentalCarsServiceClient {
public static void main(String[] args) throws MalformedURLException {
	try {
		Garage g = new GarageImpl();
		Naming.rebind("rmi://localhost/RentalCarService", g);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}
