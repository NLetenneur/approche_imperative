package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		Random rand = new Random();
		int randomNb = rand.nextInt(101);
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Ecrire un nombre");
		int nb = scanner.nextInt() ;
		int tour=1;
		while (nb!=randomNb) {
			if(nb>randomNb) {
				System.out.println("Ecrire un nombre plus petit que "+nb);
				nb = scanner.nextInt() ;
				tour++;
			}else {
				System.out.println("Ecrire un nombre plus grand que "+nb);
				nb = scanner.nextInt() ;
				tour++;
			}
		}
		System.out.println(" Bravo, vous avez trouvé en "+tour+" coups");
		
	}

}
