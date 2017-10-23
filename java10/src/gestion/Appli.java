package gestion;
//Importation du package util
import util.Compteur;
public class Appli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialisation du premier objet Compteur
		Compteur compteur1 = new Compteur();
		//Augmentation du membre cpt de cet objet
		for(int i=0 ; i<3 ; i++) {
			compteur1.increment();
		}
		//Affichage de cette objet
		compteur1.affiche();
				
		//Initialisation du dexième objet Compteur
		Compteur compteur2 = new Compteur();
		//Augmentation du membre cpt de cet objet
		for(int i=0 ; i<5 ; i++ ) {
			compteur2.increment();
		}
		//Affichage de cet objet
		compteur2.affiche();
	}

}
