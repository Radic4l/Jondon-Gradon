package Game;

public class detailsPerso {

	public static void persoDetails() {
		Guerrier monGuerrier = new Guerrier();
		Arme monArme = new Arme();
		Convert showDgt = new Convert();
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("------------------------------Jondons & Gradons------------------------------");
		System.out.println("");
		System.out.println("                                 Infos Heros                                 ");
		System.out.println("");
		System.out.println("");
		System.out.println("                        Votre guerrier se nomme " + monGuerrier.guerrierNom().toUpperCase() + " !");
		System.out.println("");
		System.out.println("                        Il poss�de une vie d'un total de " + monGuerrier.guerrierVie() + " !");
		System.out.println("");
		System.out.println("                        Il poss�de la c�l�bre �p�e " + monGuerrier.guerrierArmeNom() + " !");
		System.out.println("");
		//// Test de conversion integer to string // status Ok // need refactoring.
		System.out.println("  Mon int s'affiche en String et affiche les d�gats de " + monArme.armeNom() + "\r\r  Elle poss�de un montant de '" + showDgt.showStr() + "' de D�gats !");
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}
