package gestion;
//Importation du package util
import util.Compteur;
public class Appli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Création du premier objet Compteur
		Compteur c1 = new Compteur();
		//Incrementation de cet objet
		c1.increment();
		//Affichage de cet objet
		c1.affiche();

		//Lecture du compteur
		int n = c1.lireCount();
		//Afifchage du compteur
		System.out.println("n: "+n);

		//Initialisation à 0 du compteur
		c1.init();
		//Affichage de ce compteur
		c1.affiche();

		//Création du dexième joueur
		Compteur c2 = new Compteur();
		//Intialisation du cet objet avec un nombre saisi en paramètre
		c2.init(15);
		//Afifchage de cet objet
		c2.affiche();

		//Initalisation du première objet avec le deuxième objet saisi en paramètre
		c1.init(c2);
		c1.affiche();

	}

}
