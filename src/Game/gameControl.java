package Game;

// import java.util.Scanner;

public class gameControl {
	
	static boolean exit = false;
	
	public static boolean exit(boolean quitteJeu) {
		return quitteJeu;
	}

	public static void test() {
		
		inputUser userInput = new inputUser();		
		
		menuPrincipal.menuPrincip();
		
		userInput.Choix();
		
		int Choix = userInput.joueurChoix();
		
		// int Menu = 1; // Menu  / Principal utile ?
		 
		
	
			switch (Choix) {
			
			case 1:
				gameMenu.menuDeJeu();
			//	System.out.println("Choix '1' en maintenance");
				userInput.Choix();
				Choix = userInput.joueurChoix();
				break;
			
			case 2: 
				System.out.println("Choix '2'en maintenance");
				exit = true;
				System.out.println("Bye Bye");
				break;
				
			case 3:
				detailsPerso.persoDetails();
				userInput.Choix();
				Choix = userInput.joueurChoix();
				break;
			case 4:
				menuPrincipal.menuPrincip();
				userInput.Choix();
				Choix = userInput.joueurChoix();
				break;
		
			
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
