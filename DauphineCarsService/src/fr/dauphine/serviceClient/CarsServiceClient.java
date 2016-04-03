package fr.dauphine.serviceClient;

import java.rmi.Naming;

import fr.dauphine.service.Etudiant;
import fr.dauphine.service.IServiceCenter;

public class CarsServiceClient {

	public static void main(String[] args) {
		try {
			String codebase = "file:///F:/ file:///F:/observateur/ observateur/ ;";
			System.setProperty("java.rmi.server.codebase", codebase);
			System.setProperty("java.security.policy", "no.policy");
			System.setSecurityManager(new SecurityManager());
			IServiceCenter is =(IServiceCenter)Naming.lookup("rmi://localhost:1099/CarsServiceServer");
		    Etudiant etudiant = new Etudiant();
		    etudiant.setNom("Wu");
		    etudiant.setPrenom("Shitai");
			is.Subscribe(etudiant);
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}

}
