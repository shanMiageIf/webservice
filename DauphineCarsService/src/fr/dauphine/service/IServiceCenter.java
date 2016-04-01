package fr.dauphine.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface IServiceCenter extends Remote {
	public void Subscribe(IDauphinois ida)throws RemoteException;

	public void Unsubscribe(IDauphinois ida)throws RemoteException;
	
	public void addVoiture(long id, String name, Date addDate,
			String commentaire, boolean dejaloue, boolean isDisponible)
			throws RemoteException;

	public void removeVoiture(long id) throws RemoteException;

	public IVoiture findVoiture(long id) throws RemoteException;

	public void updateVoiture(long id, String name, Date addDate,
			String commentaire, boolean dejaloue, boolean isDisponible)
			throws RemoteException;
}
