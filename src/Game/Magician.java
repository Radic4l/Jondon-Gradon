package Game;

public class Magician {
	
	protected String nom = "Elma Gician";
	protected String image = "No Pics";
	protected String philtreNom = "philtre de haine";
	
	protected int vie = 800;
	protected int attaque = 200;
	
	int attaqueMagician = attaque;
	int vieMagician = vie;
	
	Sort monSort = new Sort();
	
	// infos par default du perso.
	
	// All String (4)
	
	protected String magicianNom() {
		return nom;
	}
	
	protected String magicianImage() {
		return image;
	}
	
	protected String magicianSortNom() {
		return monSort.sortNom();
	}
	
	protected String magicianPhiltreNom() {
		return philtreNom;
	}
	
	// All Integer (2)
	protected int MagicianSortDegat() {
		return monSort.sortDegat();
	}
	
	protected int MagicianAttaque() {
		return attaqueMagician;
	}
	
	protected int magicianVie() {
		return vieMagician;
	}
	
}
