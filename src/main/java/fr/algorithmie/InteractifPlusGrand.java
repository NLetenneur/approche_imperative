package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int max=0;
		for (int i=0; i<10; i++) {
			Scanner scanner = new Scanner(System.in) ;
			System.out.println("Ecrire un nombre (saisie n°"+(i+1)+"/10)");
			int nb = scanner.nextInt() ;
			if (nb>max) {
				max=nb;
			}
		}
		System.out.println("Le nombre le plus grand saisi est : "+max);

	}

}
