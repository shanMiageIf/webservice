package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DauphinoisImpl extends UnicastRemoteObject implements Dauphinois {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nom;
	private String prenom;
	private static long attendNum = 0;
	private Garage garage;

	public Garage getGarage() {
		return garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}

	private List<VoitureImpl> myVoitures = myVoitures = new ArrayList<VoitureImpl>();;

	public List<VoitureImpl> getMyVoitures() {
		return myVoitures;
	}

	public void setMyVoitures(List<VoitureImpl> myVoitures) {
		this.myVoitures = myVoitures;
	}

	public HashMap<Long, DauphinoisImpl> getAttendList() {
		return attendList;
	}

	public void setAttendList(HashMap<Long, DauphinoisImpl> attendList) {
		this.attendList = attendList;
	}

	private HashMap<Long, DauphinoisImpl> attendList = new HashMap<Long, DauphinoisImpl>();;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public DauphinoisImpl(Long id, String nom, String prenom)
			throws RemoteException {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public DauphinoisImpl() throws RemoteException {
		super();
		garage = new GarageImpl();

	}

	@Override
	public String toString() {
		return "DauphinoisImpl [id=" + id + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}

	@Override
	public void louerVoiture(long id) throws RemoteException {
		VoitureImpl v = garage.findVoiture(id);
		if (v.getIsDisponible() == true) {
			if (v.getDejaloue() != true) {
				v.setDejaloue(true);
			}
			v.setIsDisponible(false);
			System.out.println("vous louez la voiture " + v.getId());
			myVoitures.add(v);
		} else {
			System.out
					.println("votre voiture commandée n'est pas disponible, je vous ajoute à la liste d'attente");
			attendNum++;
			attendList.put(attendNum, this);
		}

		myVoitures.add(v);
	}

	@Override
	public void rendreVoiture(long id) throws RemoteException {
		VoitureImpl v = this.findMyVoiture(id);
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
	public VoitureImpl findMyVoiture(long id) throws RemoteException {
		for (int i = 0; i < myVoitures.size(); i++) {
			if (myVoitures.get(i).getId() == id) {
				System.out.println("j'ai trouvé ma voiture "
						+ myVoitures.get(i).toString());
				return myVoitures.get(i);
			}
		}
		System.out.println("je n'ai pas loué cette voiture !");
		return null;
	}

}
