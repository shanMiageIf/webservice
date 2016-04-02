package fr.dauphine.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.LinkedList;

public interface IVoiture extends Remote {

	public long getId() throws RemoteException;

	public void setId(long id) throws RemoteException;

	public Date getAddDate() throws RemoteException;
	
	public void setNote(int note) throws RemoteException;
	
	public int getNote() throws RemoteException;

	public void setAddDate(Date addDate) throws RemoteException;

	public boolean isDisponible() throws RemoteException;

	public void setDisponible(boolean isDisponible) throws RemoteException;

	public String getCommentaire() throws RemoteException;

	public void setCommentaire(String commentaire) throws RemoteException;

	public boolean isDejaloue() throws RemoteException;

	public void setDejaLoue(boolean dejaLoue) throws RemoteException;

	public String getName() throws RemoteException;

	public void setName(String name) throws RemoteException;

	public LinkedList<Professeur> getProfesseurList() throws RemoteException;

	public void setProfesseurList(LinkedList<Professeur> professeurList) throws RemoteException;

	public LinkedList<Etudiant> getEtudiantList() throws RemoteException;

	public void setEtudiantList(LinkedList<Etudiant> etudiantList) throws RemoteException;
}
