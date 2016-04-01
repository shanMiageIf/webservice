package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GarageImpl extends UnicastRemoteObject implements Garage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Map<Long, VoitureImpl> Voitures = new HashMap<Long, VoitureImpl>();
    
	public GarageImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void removeVoiture(long id) throws RemoteException {
		Voiture v = this.findVoiture(id);
		if (v != null) {
			System.out.println("je suis en train de supprimer la voiture "+ v.toString());
			Voitures.remove(v);
		} else {
			System.err
					.println(" je ne peut pas supprimer la voiture!la voiture id = "
							+ id + "n'existe pas! ");
		}

	}

	@Override
	public void addVoiture(long id, String name, Date addDate,
			String commentaire, boolean dejaloue, boolean isDisponible)
			throws RemoteException {
		VoitureImpl v = new VoitureImpl(id, name, addDate, commentaire, dejaloue,
				isDisponible);
		System.out.println("je suis entrain d'ajouter la voiture:/n"
				+ v.toString());
		Voitures.put(v.getId(), v);
	}

	@Override
	public VoitureImpl findVoiture(long id) throws RemoteException {
		for (Entry<Long, VoitureImpl> entry : Voitures.entrySet()) {
			VoitureImpl v = entry.getValue();
			if (v.getId() == id) {
				System.out.println("Trouve la voiture :/n = " + v.toString());
				return v;
			}
		}
		System.out.println("je n'ai pas trouvé la voiture ");
		return null;
	}

	@Override
	public void updateVoiture(long id, String name, Date addDate,
			String commentaire, boolean dejaloue, boolean isDisponible)
			throws RemoteException {
		Voiture v = this.findVoiture(id);
		if (v != null) {
			v.setName(name);
			v.setAddDate(addDate);
			v.setCommentaire(commentaire);
			v.setDejaloue(dejaloue);
			v.setIsDisponible(isDisponible);
			System.out.println("update la voiture ! l'information est mise à jour "+v.toString());
		     
		} else {
			System.err
					.println(" je ne peut pas supprimer la voiture!la voiture id = "
							+ id + "n'existe pas! ");
		}
	}
}
