package fr.dauphine.add;

import java.rmi.RemoteException;
import java.util.ArrayList;

import fr.dauphine.findVoiture.FindVoiture;
import fr.dauphine.service.Voiture;

public class addVoiture {
	private ArrayList<Voiture> panier  = new ArrayList<Voiture>();
	private FindVoiture fv = new FindVoiture();

	public ArrayList<Voiture> getPanier() {
		return panier;
	}
	public void addToPanier(String name, long id) {
		for (Voiture v : fv.findVoitureByName(name)) {
			try {
				if (id == v.getId()) {
					panier.add(v);
					System.out.println("voiture " + v.toString()
							+ "a été ajouté a panier !");
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
