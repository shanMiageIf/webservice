package fr.dauphine.serviceServer;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.util.Date;

import fr.dauphine.service.ServiceCenter;


public class RentalCarsServiceServer {

	public static void main(String[] args) {
		try {
			System.setSecurityManager(new RMISecurityManager());
		     ServiceCenter g =(ServiceCenter) Naming.lookup("rmi://localhost/RentalCarService");
		    g.addVoiture(0, "benz", new Date(), "belle voiture", false, true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		

	}

}