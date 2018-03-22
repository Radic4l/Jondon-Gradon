package Game;

public class Guerrier {
	
	protected String nom = "Harren";
	protected String image = "No Pics";
	protected String bouclier = "Boucavlier";
	
	int vie = 1500;
	int force = 500;
	int forceGuerrier = force;
	int vieGuerrier = vie;
	
	// New arme
	
	Arme monArme = new Arme();
	
	// infos par default du perso.
	
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
	
	// All integer (2)

protected int guerrierArmeDegat() {
		
		return monArme.armeDegat();
	}

	protected int guerrierForce() {
		return forceGuerrier;
	}
	
	protected int guerrierVie() {
		return vieGuerrier;
	}
}	
	//////////////////// TEST 
	/*

	protected int testArmeDegat() {
		return monArme.armeDegat();
	} */



/* Les armes/sorts sont caractérisés par un nom, et un niveau d’attaque, qui lorsqu’ils sont
	
	utilisés, vont venir augmenter d’autant le niveau d’attaque du joueur.

*/