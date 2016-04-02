package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class ServiceCenter extends UnicastRemoteObject implements IServiceCenter {

	HashMap<Long, Dauphinois> adherenteList;
	HashMap<Long, Voiture> voitureList;

	protected ServiceCenter() throws RemoteException {
		super();
		adherenteList = new HashMap<Long, Dauphinois>();
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
		if (iv != null) {
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
	public void louerVoiture(long id, long Dauphineid) throws RemoteException {
		IVoiture v = this.findVoiture(id);
		for (Entry<Long, Dauphinois> entry : adherenteList.entrySet()) {
			long dauphinois_id = entry.getKey();
			Dauphinois dauphinois = entry.getValue();
			if (Dauphineid == dauphinois_id) {
				if (v.isDisponible() == true) {
					dauphinois.setVoiture(v);
					v.setDisponible(false);
				} else {
					System.out.println(
							"votre voiture commandée n'est pas disponible, je vous ajoute à la liste d'attente");
					if (dauphinois instanceof Professeur) {
						v.getProfesseurList().add((Professeur) dauphinois);
					} else {
						v.getEtudiantList().add((Etudiant) dauphinois);
					}
					v.setDisponible(false);
					if (v.isDejaloue() == false) {
						v.setDejaLoue(true);
					}
				}
			} else {
				System.out.println("vous n'etes pas inscrit.");
			}
		}
	}

	@Override
	public void rendreVoiture(long id, long Dauphineid) throws RemoteException {
		IVoiture v = this.findVoiture(id);
		for (Entry<Long, Dauphinois> entry : adherenteList.entrySet()) {
			long dauphinois_id = entry.getKey();
			Dauphinois dauphinois = entry.getValue();
			if (Dauphineid == dauphinois_id) {
				if (dauphinois.getMyVoiture().equals(v)) {
					dauphinois.setMyVoiture(null);
					v.setDisponible(true);
					Scanner in = new Scanner(System.in);
					System.out.println("Veuillez entrer une note de 1 à 5");
					int note = in.nextInt();
					v.setNote(note);
					System.out.println("Veuillez entrer un commentaire en une ligne");
					String commentaire = in.nextLine();
					v.setCommentaire(commentaire);
				}
			}
		}
	}

	@Override
	public IVoiture findVoiture(long id) throws RemoteException {
		try {
			for (Entry<Long, Voiture> entry : voitureList.entrySet()) {
				long id1 = entry.getKey();
				Voiture v = entry.getValue();
				if (v.getId() == id1) {
					return v;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}
}
