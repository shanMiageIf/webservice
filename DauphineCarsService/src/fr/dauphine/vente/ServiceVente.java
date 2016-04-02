package fr.dauphine.vente;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import fr.dauphine.service.Dauphinois;
import fr.dauphine.service.IVoiture;
import fr.dauphine.service.ServiceCenter;
import fr.dauphine.service.Voiture;

public class ServiceVente {

	public void venteVoiture(Dauphinois Ed, Voiture Voi) throws RemoteException{
		
		if(Voi.isDisponible()&&Voi.isDejaloue()){
			Date today = Calendar.getInstance( ).getTime( );
			long diff = today.getTime( ) - Voi.getAddDate().getTime( );
			 
            double d= (diff / (1000*60*60*24))/365;
            int i = (int)d;
            
			
			
		}
		
	}
}
