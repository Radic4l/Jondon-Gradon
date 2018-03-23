package Game;

public class Clear {
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	} 
	protected void clearConsole() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
