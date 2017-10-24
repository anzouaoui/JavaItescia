package java14;

public class Majus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 1) {
			System.out.println("Il faut fournir une phrase en argument !");
		} else {
			//Récupération de la saisie
			String phrase = args[0];
			//Transformation de la première lettre en majuscule
			char firstLetter = Character.toUpperCase(phrase.charAt(0));
			//Récupération de la suite de la phrase sans la première lettre
			String suitePhrase = phrase.substring(1);
			//Transfomation de toute les lettres de cette suite en minuscule
			String minus = suitePhrase.toLowerCase();
			//Affichage de la phrase.
			System.out.println(firstLetter + minus);
		}
	}
}
