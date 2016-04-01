package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Dauphinois extends UnicastRemoteObject implements IDauphinois {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nom;
	private String prenom;
	private static long attendNum = 0;
	public Dauphinois() throws RemoteException {
		super();
	}

	public Dauphinois(Long id, String nom, String prenom) throws RemoteException {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

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

	public static long getAttendNum() {
		return attendNum;
	}

	public static void setAttendNum(long attendNum) {
		Dauphinois.attendNum = attendNum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public void louerVoiture(long id,IServiceCenter is) throws RemoteException {

	}

	@Override
	public void rendreVoiture(long id)throws RemoteException {
		

	}

	@Override
	public void messageOfAdherente() throws RemoteException {
		System.out.println("vous ête adherente maintenant! ");		
	}
}
