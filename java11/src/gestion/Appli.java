package gestion;
//Importation du package util
import util.Compteur;
public class Appli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cr�ation du premier objet Compteur
		Compteur c1 = new Compteur();
		//Incrementation de cet objet
		c1.increment();
		//Affichage de cet objet
		c1.affiche();

		//Lecture du compteur
		int n = c1.lireCount();
		//Afifchage du compteur
		System.out.println("n: "+n);

		//Initialisation � 0 du compteur
		c1.init();
		//Affichage de ce compteur
		c1.affiche();

		//Cr�ation du dexi�me joueur
		Compteur c2 = new Compteur();
		//Intialisation du cet objet avec un nombre saisi en param�tre
		c2.init(15);
		//Afifchage de cet objet
		c2.affiche();

		//Initalisation du premi�re objet avec le deuxi�me objet saisi en param�tre
		c1.init(c2);
		c1.affiche();

	}

}
