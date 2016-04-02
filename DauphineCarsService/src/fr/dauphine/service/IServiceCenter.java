package fr.dauphine.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public interface IServiceCenter extends Remote {
	public void Subscribe(IDauphinois ida) throws RemoteException;

	public void Unsubscribe(IDauphinois ida) throws RemoteException;

	public void addVoiture(long id, String name, Date addDate, String commentaire, boolean dejaloue,
			boolean isDisponible) throws RemoteException;

	public void removeVoiture(long id) throws RemoteException;

	public List<IVoiture> findVoiture(String name) throws RemoteException;

	public IVoiture findVoiture(long id) throws RemoteException;

	public void updateVoiture(long id, String name, Date addDate, String commentaire, boolean dejaloue,
			boolean isDisponible) throws RemoteException;

	public void louerVoiture(long id, IServiceCenter is) throws RemoteException;

	public void rendreVoiture(long id) throws RemoteException;
}
