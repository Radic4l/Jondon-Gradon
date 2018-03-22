package Game; // Mes packages

// Mes Imports



public class gameStart {

	public static void main(String[] args) { // Point d'entré de mon programme.
		// TODO Auto-generated method stub
		
		// Scanner
		
		
		//////////
		
	
		// Mon guerrier !
		
		Guerrier monGuerrier = new Guerrier(); // Nouvelle instance guerrier
		inputUser userInput = new inputUser();
		                                         // Affichage de mon Guerrier
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------Jondons & Gradons------------------------------");
		System.out.println("");
		System.out.println("                                 Infos Heros                                 ");
		System.out.println("");
		System.out.println("");
		System.out.println("                        Votre guerrier se nomme " + monGuerrier.guerrierNom().toUpperCase() + " !");
		System.out.println("");
		System.out.println("                        Il possède une vie d'un total de " + monGuerrier.guerrierVie() + " !");
		System.out.println("");
		System.out.println("                        Il possède la célèbre épée " + monGuerrier.guerrierArmeNom() + " !");
		System.out.println("");
		System.out.println("");
		userInput.nouvelleArme();
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}

}

/* public static void clear() {
	System.out.print("\033[H\033[2J");
	System.out.flush();
}
Clear terminal */