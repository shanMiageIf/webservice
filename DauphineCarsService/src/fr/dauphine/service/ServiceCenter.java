package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ServiceCenter extends UnicastRemoteObject implements IServiceCenter {

	HashMap<Long, Dauphinois> adherentes;
	HashMap<Long, Voiture> voitureList;

	public ServiceCenter() throws RemoteException {
		super();
		adherentes = new HashMap<Long, Dauphinois>();
		voitureList = new HashMap<Long, Voiture>();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void Subscribe(IDauphinois ida) throws RemoteException {

	}

	@Override
	public void Unsubscribe(IDauphinois ida) throws RemoteException {

	}

	@Override
	public void addVoiture(long id, String name, Date addDate, String commentaire, boolean dejaloue,
			boolean isDisponible) throws RemoteException {
		Voiture v = new Voiture();
		v.setId(id);
		v.setDisponible(isDisponible);
		v.setAddDate(new Date());
		v.setName(name);
		v.setDejaLoue(dejaloue);
		v.setCommentaire(commentaire);
		voitureList.put(v.getId(), v);
	}

	@Override
	public void removeVoiture(long id) throws RemoteException {

	}

	@Override
	public List<IVoiture> findVoiture(String name) throws RemoteException {
		List<IVoiture> findList = new ArrayList<IVoiture>();
		for (Entry<Long, Voiture> entry : voitureList.entrySet()) {
			long id = entry.getKey();
			Voiture v = entry.getValue();
			if (v.getName().equals(name)) {
				findList.add(v);
			}
		}
		return findList;

	}

	@Override
	public void updateVoiture(long id, String name, Date addDate, String commentaire, boolean dejaloue,
			boolean isDisponible) throws RemoteException {
		     IVoiture iv = this.findVoiture(id);
	            if(iv!=null){
				iv.setName(name);
				iv.setAddDate(addDate);
				iv.setCommentaire(commentaire);
				iv.setDejaLoue(dejaloue);
				iv.setDisponible(isDisponible);
				System.out.println("update la voiture ! l'information est mise à jour " + iv.toString());
	               
			} else {
				System.err.println(" je ne peut pas supprimer la voiture!la voiture n'existe pas! ");
			}
		}

	

	@Override
	public void louerVoiture(long id, IServiceCenter is) throws RemoteException {
		IVoiture v = this.findVoiture(id);
		if (v.isDisponible()==true) {
			if (v.isDejaloue()==false) {
				v.setDejaLoue(true);
				v.setDisponible(false);	
			}
			System.out.println("vous louez la voiture " + v.getName());
			
		} else {
			System.out.println("votre voiture commandée n'est pas disponible, je vous ajoute à la liste d'attente");
			attendNum++;
			attendList.put(attendNum, this);
		}

		myVoitures.add(v);

	}

	@Override
	public void rendreVoiture(long id) throws RemoteException {
		IVoiture v = this.findVoiture(id);
		myVoitures.remove(v);
		v.setIsDisponible(true);
		garage.updateVoiture(id, v.getName(), v.getAddDate(),
				v.getCommentaire(), v.getDejaloue(), v.getIsDisponible());
		if (attendList != null) {
			DauphinoisImpl dauphinois = attendList.get(attendNum);
			v.setIsDisponible(false);
			garage.updateVoiture(id, v.getName(), v.getAddDate(),
					v.getCommentaire(), v.getDejaloue(), v.getIsDisponible());
			dauphinois.getMyVoitures().add(v);
		} else if (attendList == null) {
			attendNum = 0;
		}

	}

	@Override
	public IVoiture findVoiture(long id) throws RemoteException {
		for (Entry<Long, Voiture> entry : voitureList.entrySet()) {
			long id1 = entry.getKey();
			Voiture v = entry.getValue();
			if (v.getId() == id1) {
				return v;
			}
		}
		return null;
	}
}
