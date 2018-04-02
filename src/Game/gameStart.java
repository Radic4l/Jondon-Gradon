package Game; // Mes packages

// Mes Imports



public class gameStart {

	public static void main(String[] args) { // Point d'entré de mon programme.
			
		////////////////// Mes Instances de Classes
		// Mon guerrier
//		Guerrier monGuerrier = new Guerrier(); // Nouvelle instance guerrier
		// Scanner
//		inputUser userInput = new inputUser(); // Nouvelle instance de mon Scanner
		// Mon Arme
//		Arme monArme = new Arme();
		// convert
//		Convert showDgt = new Convert();
		do {
			gameControl.test();
		}while(gameControl.exit != true);
		
		
		// gameMenu GameMenu = new gameMenu();
		// Clear terminal
		// Clear clearWindow = new Clear();
		//////////////////
		
		// Affichage de mon Guerrier
		//Game.Clear.clearScreen();
		
		/*		System.out.println("");
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
		System.out.println("  Mon int s'affiche en String et affiche les dégats de " + monArme.armeNom() + "\r\r  Elle possède un montant de '" + showDgt.showStr() + "' de Dégats !");
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1 : Afficher le menu");
		System.out.println("2 : Exit");
		
		//GameMenu.menuPrincipal();
		
		userInput.Choix(); // Prise de commandes / need refactoring.
		int reponse = userInput.joueurChoix();
		
		switch (reponse) {
		case 1:
			gameMenu.menuDeJeu();
			userInput.Choix();
			reponse = userInput.joueurChoix();
		case 2:
			//new ProcessBuilder("cmd", "/c", "cls");
			//ProcessBuilder clear = new ProcessBuilder();
			//ProcessBuilder();
			// int test = ProcessBuilder();
			gameControl.test();
			break;
		case 3:	
			gameMenu.Exit();
		default :
			
			
			
		} */
	}
	

	/*private static void ProcessBuilder() {
		return ProcessBuilder();
		// TODO Auto-generated method stub
		
	} */

}



////commande clear terminal
/* public static void clear() {
	System.out.print("\033[H\033[2J");
	System.out.flush();
}
Clear terminal */