package histoire;

import personnage.Druide;
import personnage.Gaulois;
import personnage.Romain;

public class Scenario {

	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",25);
		Druide panoramix = new Druide("Panoramix",5,10);
		Romain minus = new Romain("Minus",6);
		
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.booster(obelix);
		obelix.parler("Par Belenos ce n'est pas juste !");
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.parler("AÏe");
		asterix.frapper(minus);
		minus.parler("AÏe");
		asterix.frapper(minus);
		System.out.println("J'abandonne...");

	}

}
