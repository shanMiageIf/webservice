package fr.dauphine.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDauphinois extends Remote {
	public void louerVoiture(long id,IServiceCenter is) throws RemoteException;
	public void rendreVoiture(long id) throws RemoteException;
    public void messageOfAdherente()throws RemoteException;
}
