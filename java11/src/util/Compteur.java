package util;

public class Compteur {
	//Membre privée de la classe Compteur
		private int cpt;
		
		public Compteur() {
			
		}
		
		/**
		 * Fonction permettant d'augmenter le membre cpt  
		 */
		public void increment() {
			cpt++;
		}
		
		/**
		 * Fonction permettant d'afficher la valeur de cpt
		 */
		public void affiche() {
			System.out.println("Valeur: " + cpt);
		}
		
		/**
		 * Fonction permettant de lire le compteur
		 * @return
		 */
		public int lireCount() {
			return cpt;
		}
		
		/**
		 * Fonction permettant d'initialiser à 0 le compteur
		 */
		public void init() {
			cpt = 0;
		}
		
		/**
		 * Fonction permettant d'initialiser le compteur avec un nombre saisi en paramètre
		 * 
		 * @param nombre
		 */
		public void init(int nombre) {
			cpt = nombre;
		}
		
		/**
		 * Fonction permettant d'initaliser le compteur avec un autre compteur saisie en paramètre
		 * 
		 * @param compteur
		 */
		public void init(Compteur compteur) {
			cpt = compteur.cpt;
		}
}
