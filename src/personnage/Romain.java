package personnage;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	//public String toString() {
		//return 
	//}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	
	
	public void main() {
		int forceCoup = 5;
		Romain minus = new Romain("Minus",-6);
		prendreParole();
		minus.parler("est-ce que moi aussi ?");
		recevoirCoup(forceCoup);
	}
}





