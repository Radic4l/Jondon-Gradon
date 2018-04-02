package Game;

public class Guerrier {

	// infos par default du perso.	
	protected String nom = "Harren";
	protected String image = "No Pics";
	protected String bouclier = "Boucavlier";
//////////
	int vie = 100 + (int)(Math.random() * (100 - 1));
	int force = 500;
	int forceGuerrier = force;
	int vieGuerrier = vie;
	
	
	Arme monArme = new Arme(); // Créer une nouvelle arme

	
	// All String (4)
	protected String guerrierNom() {
		return nom;
	}
	
	protected String guerrierImage() {
		return image;
	}
	
	protected String guerrierArmeNom() {
		
		return monArme.armeNom();
	}
	
	protected String GuerrierBouclier() {
		return bouclier;
	}

//All integer (2)

	/*    Integer de Arme Degats // Utile ? / delete ?
protected int guerrierArmeDegat() {
		
		return monArme.armeDegat();
	} */

	protected int guerrierForce() {
		return forceGuerrier;
	}
	
	protected int guerrierVie() {
		return vieGuerrier;
	}
}	

	//////////////////// TEST 




