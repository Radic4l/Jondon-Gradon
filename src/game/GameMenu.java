package game;
// Menu 2
public class GameMenu extends GameStart{
	
	
	
	public static void menuDeJeu() {
//		gameStart.main(args).userInput.Choix();
		System.out.println("_________________________________________");
		System.out.println("----------------Game Menu----------------|");
		System.out.println("                                         |");
		System.out.println("1 ) Créer un nouveau Guerrier            |");
		System.out.println("2 ) Créer un nouveau Mage                |");
		System.out.println("3 ) afficher mon Guerrier                |");
		System.out.println("4 ) Retour au menu principal             |");
		System.out.println("                                         |");
		System.out.println("                                         |");
		System.out.println("_________________________________________|");
		
	}
	
	public static void exit() {
		Clear.clearConsole();
		System.out.println("Bye Bye !");
	}
	
}
