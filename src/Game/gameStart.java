package Game;

public class gameStart {

	public static void main(String[] args) { // Point d'entré de mon programme.
		// TODO Auto-generated method stub
		
		
		// Mon guerrier !
		
		Guerrier monGuerrier = new Guerrier(); // Nouvelle instance guerrier
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println( "Votre guerrier se nomme " + monGuerrier.guerrierNom().toUpperCase() + " !");
		System.out.println("");
		System.out.println("Il possede une vie d'un total de " + monGuerrier.guerrierVie() + " !");
		System.out.println("");
		System.out.println("Il possede la célèbre épée " + monGuerrier.guerrierArmeNom() + " !");
		
	}

}