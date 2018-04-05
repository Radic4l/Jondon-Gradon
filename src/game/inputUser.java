package game;

import java.util.Scanner;

public class inputUser {
	
	Scanner sc = new Scanner(System.in);
	
	int ChoixJoueur;
	
	protected void Choix() {
		
		System.out.println("Faite votre choix");
		ChoixJoueur = sc.nextInt();
		sc.nextLine();
		System.out.println("choixjoueur="+ChoixJoueur);
		// int inputInt = sc.nextInt();
		
		// System.out.println("Vous avez saisi le nombre : " + inputInt);
		
		
/*		int test = inputInt;
		
		protected int test1 {
			return test1;

		}
		*/
	}
	protected int joueurChoix() {
		return ChoixJoueur;
	}

	protected void Choix2() { 
		
		String inputString = sc.nextLine();
		System.out.println("Vous avez saisi la phrase : " + inputString);
	}
}
