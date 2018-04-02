package Game;

public class Arme {

	protected String armeNom = "Excaliburne";
	protected int armeDegat = 50 + (int)(Math.random() * (100 - 1));
	
	protected String armeNom() {		
		return armeNom;
	}
	protected int armeDegat() {		
		return armeDegat;
	
	}
/*
//////////Convert integer armeDegat toString////////////
	Arme monArme = new Arme();                        //
	String test=String.valueOf(monArme.armeDegat());  //
	protected String test() {                         //
		return test;                                  //
	}                                                 //
////////////////////////////////////////////////////////
*/
}
