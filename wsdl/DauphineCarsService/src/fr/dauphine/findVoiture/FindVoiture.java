package fr.dauphine.findVoiture;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import fr.dauphine.service.ServiceCenter;
import fr.dauphine.service.Voiture;

public class FindVoiture {
	private ServiceCenter sc;

	public FindVoiture() {
	}
	public long TimeOfUse(Date date) {
		Calendar nowDate = Calendar.getInstance(), oldDate = Calendar
				.getInstance();
		nowDate.setTime(new Date());
		oldDate.setTime(date);
		long timeNow = nowDate.getTimeInMillis();
		long timeOld = oldDate.getTimeInMillis();
		long diffrence = (timeNow - timeOld) / (1000 * 60 * 60 * 24);
		return diffrence;
	}

	public Voiture []findVoitureByName(String name) {
		ArrayList<Voiture> voitures = new ArrayList<Voiture>();
		HashMap<Long, Voiture> Resultlist = sc.getVoitureList();
		for (Entry<Long, Voiture> entry : Resultlist.entrySet()) {
			Voiture v = entry.getValue();
			try {
				if (v.getName() == name) {
					if (this.TimeOfUse(v.getAddDate()) >= 730
							&& v.isDejaloue() == true
							&& v.isDisponible() == true) {
						v.toString();
						voitures.add(v);
					} else {
						System.out.println("je n'ai pas trouvé !");
					}
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Voiture[] voitureTab =new  Voiture[voitures.size()];
		for (int i=0;i<voitures.size();i++) {
			voitureTab[i]=voitures.get(i);
			System.out.println("les voitures ont été trouvé est "
					+ voitureTab[i].toString());
		}
		return voitureTab;

	}
}