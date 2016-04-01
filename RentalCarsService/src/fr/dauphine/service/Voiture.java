package fr.dauphine.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface Voiture extends Remote{
	
		public long getId() throws RemoteException;

		public void setId(long id) throws RemoteException;

		public void setName(String name) throws RemoteException;;

		public String getName() throws RemoteException;

		public Date getAddDate() throws RemoteException;

		public void setAddDate(Date addDate) throws RemoteException;

		public void setIsDisponible(boolean isDisponible) throws RemoteException;

		public boolean getIsDisponible() throws RemoteException;

		public String getCommentaire() throws RemoteException;

		public void setCommentaire(String Commentaire) throws RemoteException;

		public boolean getDejaloue() throws RemoteException;

		public void setDejaloue(boolean dejaloue) throws RemoteException;
	}


