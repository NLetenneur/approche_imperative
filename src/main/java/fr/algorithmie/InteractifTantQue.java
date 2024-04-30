package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Ecrire un nombre");
		int nb = scanner.nextInt() ;
		while ((nb>10)||(nb<1)) {
			System.out.println("Mauvais nombre ! Essayer encore");
			nb = scanner.nextInt() ;
		}
		System.out.println(nb);

	}

}
