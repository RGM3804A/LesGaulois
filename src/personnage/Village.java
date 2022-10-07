package personnage;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
	}
	
	public void setchef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public AjouterHabitant(Gaulois gaulois) {
		this.Gaulois[nbVillageoisMaximum] = gaulois;
		
	}
}
