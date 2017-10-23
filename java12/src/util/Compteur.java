package util;

public class Compteur {
	//Membre priv�e de la classe Compteur
		private int cpt;
		
		/**
		 * Constructeur de la classe Compteur sans param�tre
		 */
		public Compteur() {
			
		}
		
		/**
		 * Constructeur de la classe Compteur avec en param�tre un entier
		 * 
		 * @param compteur
		 */
		public Compteur(int compteur) {
			cpt = compteur;
		}
		
		/**
		 * Constructeur de la classe Compteur avec param�tre un autre compteur
		 * 
		 * @param compteur
		 */
		public Compteur(Compteur compteur) {
			cpt = compteur.cpt;
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
		 * Fonction permettant d'initialiser � 0 le compteur
		 */
		public void init() {
			cpt = 0;
		}
		
		/**
		 * Fonction permettant d'initialiser le compteur avec un nombre saisi en param�tre
		 * 
		 * @param nombre
		 */
		public void init(int nombre) {
			cpt = nombre;
		}
		
		/**
		 * Fonction permettant d'initaliser le compteur avec un autre compteur saisie en param�tre
		 * 
		 * @param compteur
		 */
		public void init(Compteur compteur) {
			cpt = compteur.cpt;
		}
}
