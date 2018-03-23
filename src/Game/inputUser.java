package Game;

import java.util.Scanner;

public class inputUser {
	
	Scanner scStr = new Scanner(System.in);
	Scanner scInt = new Scanner(System.in);
	
	protected void Choix() {
		scStr = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		int inputInt = scInt.nextInt();
		System.out.println("Vous avez saisi le nombre : " + inputInt);
	} 

	protected void Choix2() { 
		scStr = new Scanner(System.in);
		System.out.println("Veuillez saisir une phrase :");
		String inputString = scStr.nextLine();
		System.out.println("Vous avez saisi la phrase : " + inputString);
	}
}
