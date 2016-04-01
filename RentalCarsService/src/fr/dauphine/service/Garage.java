package fr.dauphine.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface Garage extends Remote {
	public void addVoiture(long id, String name, Date addDate,
			String commentaire, boolean dejaloue, boolean isDisponible)
			throws RemoteException;

	public void removeVoiture(long id) throws RemoteException;

	public VoitureImpl findVoiture(long id) throws RemoteException;

	public void updateVoiture(long id, String name, Date addDate,
			String commentaire, boolean dejaloue, boolean isDisponible)
			throws RemoteException;

	
}
