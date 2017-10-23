package java13;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Il faut fournir un mot en argument !");
		} else {
			//Récupération du mot saisie
			String mot = args[0];
			//Utilisation de la classe StringBuffer pour inverser les lettres
			StringBuffer motBuffer = new StringBuffer(mot);
			
			//Renversmemen du mot avec la méthode reverse de la classe StringBuffer, transformation en String avec la méthode toString
			//Et comparaison de ce renversement avec le mot de départ
			if(motBuffer.reverse().toString().equals(mot)) {
				//Si ils sont pareils ==> le mot est un palindrome
				System.out.println("Le mot est un palindrome");
			}else {
				//Si ils ne sont pas pareils ==> le n'est pas un palindrome
				System.out.println("Le mot n'est pas un palindrome");
			}
		}
	}

}