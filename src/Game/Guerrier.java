package Game;

public class Guerrier {
	
	protected String nom = "Harren";
	protected String image = "No Pics";
	protected String armeNom = "Excaliburne";
	protected String bouclier = "Boucavlier";
	
	int vie = 1500;
	int force = 500;
	int forceGuerrier = force;
	int vieGuerrier = vie;
	
	
	// infos par default du perso.
	
	// All String (4)
	protected String guerrierNom() {
		return nom;
	}
	
	protected String guerrierImage() {
		return image;
	}
	
	protected String guerrierArmeNom() {
		return armeNom;
	}
	
	protected String GuerrierBouclier() {
		return bouclier;
	}
	
	// All integer (2)
	
	public int guerrierForce() {
		return forceGuerrier;
	}
	
	public int guerrierVie() {
		return vieGuerrier;
	}
}

/* Les armes/sorts sont caractérisés par un nom, et un niveau d’attaque, qui lorsqu’ils sont
	
	utilisés, vont venir augmenter d’autant le niveau d’attaque du joueur.

*/