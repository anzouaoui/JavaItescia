package util;

public class Compteur {
	//Membre privée de la classe Compteur
		private int cpt;
		
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
}
