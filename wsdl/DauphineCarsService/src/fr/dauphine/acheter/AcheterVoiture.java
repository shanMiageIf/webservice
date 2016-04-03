package fr.dauphine.acheter;

import java.rmi.RemoteException;

import fr.dauphine.add.addVoiture;
import fr.dauphine.service.ServiceCenter;
import fr.dauphine.service.Voiture;

public class AcheterVoiture {
	private addVoiture av;
	private ServiceCenter sc;

	

	public AcheterVoiture(addVoiture av, ServiceCenter sc) {
		this.av = av;
		this.sc = sc;
	}

	public AcheterVoiture() {
	}

	public void buyCars(long id, double prix) {
		if (av.getPanier() == null) {
			for (Voiture v : av.getPanier()) {
				try {
					if (v.getId() == id && v.getPrix() == prix) {
						sc.getVoitureList().remove(v.getId());
						System.out.println("vous avez acheté " + v.toString());
					}
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
