package fr.dauphine.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.HashMap;

public class ServiceCenter extends UnicastRemoteObject implements IServiceCenter {

	HashMap<Long, Dauphinois> adherentes;
	HashMap<Long, Voiture> voitureList;

	protected ServiceCenter() throws RemoteException {
		super();
		adherentes = new HashMap<Long, Dauphinois>();
		voitureList = new HashMap<Long, Voiture>();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void Subscribe(IDauphinois ida) throws RemoteException {

	}

	@Override
	public void Unsubscribe(IDauphinois ida) throws RemoteException {

	}

	@Override
	public void addVoiture(long id, String name, Date addDate, String commentaire, boolean dejaloue,
			boolean isDisponible) throws RemoteException {

	}

	@Override
	public void removeVoiture(long id) throws RemoteException {

	}

	@Override
	public IVoiture findVoiture(long id) throws RemoteException {

		return null;
	}

	@Override
	public void updateVoiture(long id, String name, Date addDate, String commentaire, boolean dejaloue,
			boolean isDisponible) throws RemoteException {

	}

}
