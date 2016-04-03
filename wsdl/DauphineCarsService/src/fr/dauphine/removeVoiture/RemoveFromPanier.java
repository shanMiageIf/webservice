package fr.dauphine.removeVoiture;

import java.rmi.RemoteException;

import fr.dauphine.add.addVoiture;
import fr.dauphine.findVoiture.FindVoiture;
import fr.dauphine.service.Voiture;

public class RemoveFromPanier {
	private addVoiture av;

	FindVoiture fv = new FindVoiture();

	public void RemoveVoiture(String name,long id) {
		if (av.getPanier() == null) {
		for (Voiture v : av.getPanier()) {
			try {
				if (id == v.getId()) {
                  av.getPanier().remove(v);
                  System.out.println("supprimer " +v.toString());
				}else{
					System.out.println("je n'ai pas trouvé");
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
}
