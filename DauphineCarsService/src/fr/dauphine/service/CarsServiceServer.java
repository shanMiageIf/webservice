package fr.dauphine.service;

import java.rmi.Naming;

import fr.dauphine.service.IServiceCenter;
import fr.dauphine.service.ServiceCenter;

public class CarsServiceServer {

	public static void main(String[] args) {
	 try {
		 IServiceCenter is = new ServiceCenter();
		 Naming.rebind("rmi://localhost:1099/CarsServiceServer", is);
		
	} catch (Exception e) {
	     e.printStackTrace();
	}
    
     
	}

}
