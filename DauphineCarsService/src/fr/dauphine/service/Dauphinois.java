package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Dauphinois extends UnicastRemoteObject implements IDauphinois {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nom;
	private String prenom;
	private IVoiture myVoiture;
	public Dauphinois() throws RemoteException {
		super();
	}

	public IVoiture getMyVoiture() {
		return myVoiture;
	}

	public void setMyVoiture(IVoiture myVoiture) {
		this.myVoiture = myVoiture;
	}
	public Dauphinois(Long id, String nom, String prenom) throws RemoteException {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public long getId()throws RemoteException {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	@Override
	public void messageOfAdherente() throws RemoteException {
		System.out.println("vous êtes adherente maintenant! ");		
	}

	@Override
	public IVoiture getVoiture() throws RemoteException {
		// TODO Auto-generated method stub
		return myVoiture;
	}

	@Override
	public void setVoiture(IVoiture voiture) throws RemoteException {
		// TODO Auto-generated method stub
		this.myVoiture = voiture;
	}

	


}
