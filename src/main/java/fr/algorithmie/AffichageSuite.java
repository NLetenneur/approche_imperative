package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		for (int i=1; i<11; i++) {
			System.out.println(i);
		}
		for (int i=0; i<11; i=i+2) {
			System.out.println(i);
		}
		for (int i=1; i<10; i=i+2) {
			System.out.println(i);
		}
		
		int pair=0;
		while (pair<11) {
			System.out.println(pair);
			pair=pair+2;
		}
		int impair=1;
		while (impair<10) {
			System.out.println(impair);
			impair=impair+2;
		}
	}

}
