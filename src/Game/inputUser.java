package Game;

import java.util.Scanner;

public class inputUser {
	
	Scanner scStr = new Scanner(System.in);
	Scanner scInt = new Scanner(System.in);
	
	protected void nouvelleArme() {
		scStr = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		int str = scStr.nextInt();
		System.out.println("Vous avez saisi le nombre : " + str);
	}
}
