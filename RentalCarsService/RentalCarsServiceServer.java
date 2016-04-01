package fr.dauphine.service;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.util.Date;

import fr.dauphine.service.Garage;

public class RentalCarsServiceServer {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			System.setSecurityManager(new RMISecurityManager());
		    Garage g =(Garage) Naming.lookup("rmi://localhost/RentalCarService");
		    g.addVoiture(0, "benz", new Date(), "belle voiture", false, true);
		} catch (Exception e) {
		    e.printStackTrace();
		}

	}

}
