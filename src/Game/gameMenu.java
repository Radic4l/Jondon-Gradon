package Game;

public class gameMenu extends gameStart{
	
	
	
	public static void menuDeJeu() {
//		gameStart.main(args).userInput.Choix();
		System.out.println("_________________________________________");
		System.out.println("----------------Game Menu----------------|");
		System.out.println("                                         |");
		System.out.println("1 ) Cr�er un nouveau Guerrier            |");
		System.out.println("2 ) Cr�er un nouveau Mage                |");
		System.out.println("3 ) afficher mon Guerrier                |");
		System.out.println("4 ) Retour au menu principal             |");
		System.out.println("                                         |");
		System.out.println("                                         |");
		System.out.println("_________________________________________|");
		
	}
	public static void Exit() {
		Clear.clearConsole();
		System.out.println("Bye Bye !");
	}
	
}
