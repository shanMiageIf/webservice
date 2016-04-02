package fr.dauphine.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDauphinois extends Remote {
	
    public void messageOfAdherente()throws RemoteException;
    public Voiture getVoiture()throws RemoteException;
    public void setVoiture(Voiture voiture)throws RemoteException;
}
