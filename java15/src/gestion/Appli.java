package gestion;
//Importation du package util
import util.Compteur;
public class Appli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cr�ation du premier Compteur
		Compteur c1 = new Compteur();
		//Incrementation de ce compteur
		c1.increment();
		//Affichage de ce compteur
		c1.affiche();

		//Lecture du compteur
		int n = c1.lireCount();
		//Affichage de ce lecteur
		System.out.println("n: "+n);

		//Initialisation � 0 du premier compteur
		c1.init();
		//Affichage de ce compteur
		c1.affiche();

		//Cr�ation du deuxi�me compteur
		Compteur c2 = new Compteur(3);
		//Initialisation du compteur � 15
		c2.init(15);
		//Affichage de ce deuxi�me compteur
		c2.affiche();

		//Intialisation du premier compteur avec le deuxi�me compteur
		c1.init(c2);
		//Affichage de ce premier compteur
		c1.affiche();

		//Cr�ation du troisi�me compteur avec un compteur
		Compteur c3 = new Compteur(c2);
		//Affichage de ce troisi�me compteur
		c3.affiche();
		
		//Test de comparaison
		if(c1.compare(c2)) {
			System.out.println("c1 et c2 ont le m�me �tat");
		}else {
			System.out.println("c1 et c2 ont des �tats differents");
		}
	}

}
