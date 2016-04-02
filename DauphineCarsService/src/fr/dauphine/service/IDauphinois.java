package fr.dauphine.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDauphinois extends Remote {
	public long getId()throws RemoteException;
    public void messageOfAdherente()throws RemoteException;
    public IVoiture getVoiture()throws RemoteException;
    public void setVoiture(IVoiture voiture)throws RemoteException;
}
