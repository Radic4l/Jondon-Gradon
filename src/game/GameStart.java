package game; // Mes packages

// Mes Imports



public class GameStart {

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
			
		
		GameControl.exitGame = false;
		MenuPrincipal.menuPrincipal();
		while(! GameControl.exitGame) {
			GameControl.test();
		}
		
		
		// gameMenu GameMenu = new gameMenu();
		// Clear terminal
		// Clear clearWindow = new Clear();
		//////////////////
		
		// Affichage de mon Guerrier
		//Game.Clear.clearScreen();
		
		/*
		 * 
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