package fr.dauphine.serviceClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

import fr.dauphine.service.ServiceCenter;



public class RentalCarsServiceClient {


	public static void main(String[] args) throws MalformedURLException {
		try {
			ServiceCenter g = new ServiceCenter();
			Naming.rebind("rmi://localhost/RentalCarService", g);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner i = new Scanner();
		System.out.println("Identifiez vous");
	}
}
