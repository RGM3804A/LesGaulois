package personnage;

public class Romain {
	private String nom;
	private String texte;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
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
		assert force>0;
		int force_init = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force == (force_init - forceCoup);
	}
	
	public void sEquiper(Equipement equipement) {
		int nb_equipement = 0;
		for(int i=0;i<equipements.length;i+=1){
			if(equipements[i]==Equipement.CASQUE || equipements[i]==Equipement.BOUCLIER) {nb_equipement+=1;}
		}
		switch(nb_equipement){
			case 2:
				System.out.println("Le Soldat " + nom + " est déja bien protégé !");
				break;
			case 1:
				if(equipements[0] != equipement) {
					System.out.println("Le Soldat " + nom + " s’équipe avec un " + equipement);
					equipements[1] = equipement;
				}else{
					System.out.println("Le Soldat " + nom + " possède déjà un " + equipement + " !");
				}
				break;
			case 0:
				equipements[0] = equipement;
				System.out.println("Le Soldat " + nom + " s’équipe avec un " + equipement + " !");
				break;
		}
	}
	
	public static void main(String[] args) {
		int forceCoup = 5;
		Romain minus = new Romain("Minus",6);
		minus.prendreParole();
		minus.parler("est-ce que moi aussi ?");
		minus.recevoirCoup(forceCoup);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
	/*
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		switch (force) {
		case 0:
		parler("Aïe");
		default:
		equipementEjecte = ejecterEquipement();
		parler("J'abandonne...");
		break;
		}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
		}

		private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
		texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
		for (int i = 0; i < nbEquipement;) {
			if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
				resistanceEquipement += 8;
		} else {
			System.out.println("Equipement casque");
			resistanceEquipement += 5;
		}
		i++;
		}
		texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
		private Equipement[] ejecterEquipement() {
			Equipement[] equipementEjecte = new Equipement[nbEquipement];
			System.out.println("L'équipement de " + nom.toString() + "s'envole sous la force du coup.");
			//TODO
			int nbEquipementEjecte = 0;
			for (int i = 0; i < nbEquipement; i++) {
				if (equipements[i] == null) {
					continue;
					} else {
						equipementEjecte[nbEquipementEjecte] = equipements[i];
						nbEquipementEjecte++;
						equipements[i] = null;
					}
					
					return equipementEjecte;
					}

		}*/
}