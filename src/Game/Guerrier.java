package Game;

public class Guerrier {

///////////start////////// infos par default du perso.	
	protected String nom = "Harren";
	protected String image = "No Pics";
	protected String bouclier = "Boucavlier";
	
	int vie = 1500;
	int force = 500;
	int forceGuerrier = force;
	int vieGuerrier = vie;
	
/////////start///////// Créer une nouvelle arme
	
	Arme monArme = new Arme();
	
/////////end///////// Créer une nouvelle arme



///////////end////////// infos par default du perso.
	
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
	
 
/////////////////start///////////////////  Convert toString method // need refactoring

String test=String.valueOf(monArme.armeDegat());
protected String test() {
	return test;
}

////////////////end/////////////////// Convert toString method // need refactoring

//All integer (2)

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