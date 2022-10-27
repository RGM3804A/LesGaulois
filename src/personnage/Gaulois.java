package personnage;

public class Gaulois {
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	private String nom;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	/*private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}*/
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

	/*public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force*effetPotion / 3);
	}*/
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la	mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}
	
	public int boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
		return effetPotion;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus",6);
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("est-ce que sa fonctionne ?");
		asterix.frapper(minus);
		Druide panoramix = new Druide("Panoramix",5,10);
		
		asterix.boirePotion(panoramix.preparerPotion());
		
	}

}






