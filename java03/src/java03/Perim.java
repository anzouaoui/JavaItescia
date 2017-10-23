package java03;

public class Perim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Il faut fournir le rayon en argument !");
		} else {
			double rayon = Double.parseDouble(args[0]);
			double perimetre = 2 * 3.14d * rayon;
			System.out.println("Périmètre du cercle: " + perimetre);
		}
	}

}
