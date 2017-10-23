package java04;

public class Signe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Il faut fournir un argument !");
		} else {
			int i = Integer.parseInt(args[0]);
			if(i < 0) {
				System.out.println(i + " est négatif");
			} else {
				System.out.println(i + " est positif");
			}
		}
	}

}
