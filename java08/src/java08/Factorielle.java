package java08;

public class Factorielle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorielle = 1;
		if(args.length != 1) {
			System.out.println("Il faut fournir un argument !");
		} else {
			int nombre = Integer.parseInt(args[0]);
			int i = 1;
			while(i <= nombre) {
				factorielle *= i;
				i++;
			}
			System.out.println("Factorielle de " + nombre + ": " + factorielle);
		}
	}

}
