package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.LinkedList;

public class Voiture extends UnicastRemoteObject implements IVoiture {

	private static final long serialVersionUID = 1L;
	private long id;
	private Date addDate;
	private boolean isDisponible;
	private String commentaire;
	private boolean dejaLoue;
	private String name;
	private LinkedList<Professeur> professeurList;
	private LinkedList<Etudiant> etudiantList;
	private int note;
	private double prix;

	public Voiture() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(long id, Date addDate, boolean isDisponible,
			String commentaire, boolean dejaLoue, String name,
			LinkedList<Professeur> professeurList,
			LinkedList<Etudiant> etudiantList, double prix)
			throws RemoteException {
		this.id = id;
		this.addDate = addDate;
		this.isDisponible = isDisponible;
		this.commentaire = commentaire;
		this.dejaLoue = dejaLoue;
		this.name = name;
		this.professeurList = professeurList;
		this.etudiantList = etudiantList;
		this.prix = prix;
	}

	@Override
	public long getId() throws RemoteException {

		return id;
	}

	@Override
	public void setId(long id) throws RemoteException {

		this.id = id;

	}

	@Override
	public Date getAddDate() throws RemoteException {

		return addDate;
	}

	@Override
	public void setAddDate(Date addDate) throws RemoteException {

		this.addDate = addDate;
	}

	@Override
	public boolean isDisponible() throws RemoteException {

		return isDisponible;
	}

	@Override
	public void setDisponible(boolean isDisponible) throws RemoteException {

		this.isDisponible = isDisponible;
	}

	@Override
	public String getCommentaire() throws RemoteException {

		return commentaire;
	}

	@Override
	public void setCommentaire(String commentaire) throws RemoteException {

		this.commentaire = commentaire;
	}

	@Override
	public String getName() throws RemoteException {

		return name;
	}

	@Override
	public void setName(String name) throws RemoteException {
		this.name = name;

	}

	@Override
	public boolean isDejaloue() throws RemoteException {

		return dejaLoue;
	}

	@Override
	public void setDejaLoue(boolean dejaLoue) throws RemoteException {
		this.dejaLoue = dejaLoue;

	}

	@Override
	public LinkedList<Professeur> getProfesseurList() throws RemoteException {
		// TODO Auto-generated method stub
		return professeurList;
	}

	@Override
	public void setProfesseurList(LinkedList<Professeur> professeurList)
			throws RemoteException {
		this.professeurList = professeurList;

	}

	@Override
	public LinkedList<Etudiant> getEtudiantList() throws RemoteException {
		// TODO Auto-generated method stub
		return etudiantList;
	}

	@Override
	public void setEtudiantList(LinkedList<Etudiant> etudiantList)
			throws RemoteException {
		this.etudiantList = etudiantList;

	}

	@Override
	public void setNote(int note) throws RemoteException {
		this.note = note;

	}

	@Override
	public int getNote() throws RemoteException {
		// TODO Auto-generated method stub
		return note;
	}

}
