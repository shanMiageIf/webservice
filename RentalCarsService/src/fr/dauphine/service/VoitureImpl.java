package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class VoitureImpl extends UnicastRemoteObject implements Voiture {


	private long id;
	private Date addDate;
	private boolean isDisponible;
	private String Commentaire;
	private boolean dejaloue;
	private String name;
	public VoitureImpl(long id, String name, Date addDate, String commentaire, boolean dejaloue,boolean isDisponible) throws RemoteException {
		this.id = id;
		this.addDate = addDate;
		this.name =name;
		this.isDisponible = isDisponible;
		this.Commentaire = commentaire;
		this.dejaloue = dejaloue;
	}

	@Override
	public Date getAddDate() throws RemoteException{
		// TODO Auto-generated method stub
		return addDate;
	}

	@Override
	public void setAddDate(Date addDate)throws RemoteException {
	    this.addDate =addDate;
		
	}

	@Override
	public void setIsDisponible(boolean isDisponible)throws RemoteException {
		this.isDisponible =isDisponible;
	}

	@Override
	public boolean getIsDisponible() throws RemoteException{
		return isDisponible;
	}

	@Override
	public String getCommentaire()throws RemoteException {
		// TODO Auto-generated method stub
		return Commentaire;
	}

	@Override
	public void setCommentaire(String Commentaire)throws RemoteException {
	  this.Commentaire = Commentaire;
		
	}

	@Override
	public boolean getDejaloue()throws RemoteException {
		// TODO Auto-generated method stub
		return dejaloue;
	}

	@Override
	public void setDejaloue(boolean dejaloue) throws RemoteException{
	   this.dejaloue = dejaloue;
		
	}
	@Override
	public void setName(String name) throws RemoteException {
		// TODO Auto-generated method stub
		this.name =name;
		
	}
	@Override
	public String getName() throws RemoteException {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public long getId() throws RemoteException {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public void setId(long id) throws RemoteException {
        this.id=id;
		
	}

	
}
