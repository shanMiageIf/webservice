package fr.dauphine.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Dauphinois extends Remote  {
		   public void louerVoiture(long id)throws RemoteException;		  
		   public void rendreVoiture(long id)throws RemoteException;
		   public Voiture findMyVoiture(long id)throws RemoteException;
}
