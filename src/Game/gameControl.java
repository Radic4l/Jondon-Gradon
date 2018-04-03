package game;

// import java.util.Scanner;

public class GameControl {
	
	static boolean exitGame = false;
	
 public static boolean exit() {
		return exitGame;
	}

	public static void test() {
		
		
		inputUser userInput = new inputUser();		
		
		
		
		userInput.Choix();
		
		int choix = userInput.joueurChoix();
		
		// int Menu = 1; // Menu  / Principal utile ?
		 
		System.out.println("before while : ta reponse connard ======>" + choix);
		boolean quittMenu = false;
		while(! quittMenu) {
			
		
			switch (choix) {
			
			case 1:
				gameMenu.menuDeJeu();
			//	System.out.println("Choix '1' en maintenance");
				userInput.Choix();
				choix = userInput.joueurChoix();
				System.out.println("while case 1 : ta reponse connard ======>" + choix);
				
				break;
			
			case 2: 
				//System.out.println("Choix '2'en maintenance");
				exitGame = true;
				System.out.println("while case 2 : ta reponse connard ======>" + choix);
				System.out.println("Bye Bye");
				break;
				
			case 3:
				DetailsPerso.persoDetails();
				userInput.Choix();
				choix = userInput.joueurChoix();
				System.out.println("while case 3 : ta reponse connard ======>" + choix);
				break;
				
			case 4:
				MenuPrincipal.menuPrincipal();
				choix = 1;
				System.out.println("Vous quitter le menu");
				quittMenu = true;
				break;
			} 
			
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	String prenom;

		char reponse = 'O';

		Scanner newSc;
		newSc = new Scanner(System.in);

		while (reponse == 'O')

		{

		  System.out.println("Donnez un prénom : ");

		  prenom = newSc.nextLine();

		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        

		  //Sans ça, nous n'entrerions pas dans la deuxième boucle

		  reponse = ' ';

		                        

		  //Tant que la réponse n'est pas O ou N, on repose la question

		  while(reponse != 'O' && reponse != 'N')

		  {

		    //On demande si la personne veut faire un autre essai

		    System.out.println("Voulez-vous réessayer ? (O/N)");

		    reponse = newSc.nextLine().toUpperCase().charAt(0);

		  }
		System.out.println("Au revoir…");

		newSc.close();*/
		}

		
	} 
	
}
