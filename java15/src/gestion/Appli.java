package gestion;
//Importation du package util
import util.Compteur;
public class Appli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Création du premier Compteur
		Compteur c1 = new Compteur();
		//Incrementation de ce compteur
		c1.increment();
		//Affichage de ce compteur
		c1.affiche();

		//Lecture du compteur
		int n = c1.lireCount();
		//Affichage de ce lecteur
		System.out.println("n: "+n);

		//Initialisation à 0 du premier compteur
		c1.init();
		//Affichage de ce compteur
		c1.affiche();

		//Création du deuxième compteur
		Compteur c2 = new Compteur(3);
		//Initialisation du compteur à 15
		c2.init(15);
		//Affichage de ce deuxième compteur
		c2.affiche();

		//Intialisation du premier compteur avec le deuxième compteur
		c1.init(c2);
		//Affichage de ce premier compteur
		c1.affiche();

		//Création du troisième compteur avec un compteur
		Compteur c3 = new Compteur(c2);
		//Affichage de ce troisième compteur
		c3.affiche();
		
		//Test de comparaison
		if(c1.compare(c2)) {
			System.out.println("c1 et c2 ont le même état");
		}else {
			System.out.println("c1 et c2 ont des états differents");
		}
	}

}
