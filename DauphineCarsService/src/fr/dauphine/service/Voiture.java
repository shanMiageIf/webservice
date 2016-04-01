package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class Voiture extends UnicastRemoteObject implements IVoiture {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private Date addDate;
	private boolean isDisponible;
	private String commentaire;
	private boolean dejaLoue;
	private String name;

	protected Voiture() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(long id, Date addDate, boolean isDisponible, String commentaire, boolean dejaLoue, String name)
			throws RemoteException {
		super();
		this.id = id;
		this.addDate = addDate;
		this.isDisponible = isDisponible;
		this.commentaire = commentaire;
		this.dejaLoue = dejaLoue;
		this.name = name;
	}

	@Override
	public long getId() throws RemoteException {
		
		return id;
	}

	@Override
	public void setId(long id) throws RemoteException {
		
		this.id=id;
		
	}

	@Override
	public Date getAddDate() throws RemoteException {
		
		return addDate;
	}

	@Override
	public void setAddDate(Date addDate) throws RemoteException {
		
		this.addDate =addDate;
	}

	@Override
	public boolean isDisponible() throws RemoteException {
		
		return isDisponible;
	}

	@Override
	public void setDisponible(boolean isDisponible) throws RemoteException {
		
		this.isDisponible=isDisponible;
	}

	@Override
	public String getCommentaire() throws RemoteException {
		
		return commentaire;
	}

	@Override
	public void setCommentaire(String commentaire) throws RemoteException {
		
		this.commentaire=commentaire;
	}

	@Override
	public String getName() throws RemoteException {
		
		return name;
	}

	@Override
	public void setName(String name) throws RemoteException {
		this.name=name;
		
	}

	@Override
	public boolean isDejaloue() throws RemoteException {
		
		return dejaLoue;
	}

	@Override
	public void setDejaLoue(boolean dejaLoue) throws RemoteException {
		this.dejaLoue =dejaLoue;
		
	}
}
