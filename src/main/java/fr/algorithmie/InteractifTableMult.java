package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Ecrire un nombre entre 1 et 10 (inclus)");
		int nb = scanner.nextInt() ;
		while ((nb>10)||(nb<1)) {
			System.out.println("Le nombre doit être entre 1 et 10 (inclus). Nouveau nombre");
			nb = scanner.nextInt() ;
		}
		for (int i=1; i<11; i++) {
			System.out.println(nb+"*"+i+"="+nb*i);
		}
	}

}
