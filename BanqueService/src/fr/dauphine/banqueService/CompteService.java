package fr.dauphine.banqueService;

public class CompteService {
	private double money;

	public double getMoney() {
		return money;
	}

	public void addMoney(double money) {
		this.money = this.money + money;
	}

	public double retraitMoney(double money) {
		if (this.money >= money) {
			this.money = this.money - money;
		}else{
			System.out.println("Vous n'avez pas assez d'argent");
		}
		return this.money;
	}
}
