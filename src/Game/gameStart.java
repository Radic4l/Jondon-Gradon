package Game; // Mes packages

// Mes Imports



public class gameStart {

	public static void main(String[] args) { // Point d'entré de mon programme.
			
		// Mon guerrier
		Guerrier monGuerrier = new Guerrier(); // Nouvelle instance guerrier
		// Scanner
		inputUser userInput = new inputUser(); // Nouvelle instance de mon Scanner
		                                         
		
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
		//// Test de conversion integer to string // status Ok // need refactoring.
		System.out.println("  Mon int s'affiche en String et affiche les dégats de " + monGuerrier.guerrierArmeNom() + "\r\r  Elle possède un montant de '" + monGuerrier.test() + "' de Dégats !");
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.println("");
		userInput.nouvelleArme(); // Prise de commandes / need refactoring.
	}

}

////commande clear terminal
/* public static void clear() {
	System.out.print("\033[H\033[2J");
	System.out.flush();
}
Clear terminal */