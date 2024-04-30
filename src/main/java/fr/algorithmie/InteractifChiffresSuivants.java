package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Ecrire un nombre");
		int nb = scanner.nextInt() ;
		for (int i=1; i<11; i++) {
			System.out.println(nb+i);
		}

	}

}
