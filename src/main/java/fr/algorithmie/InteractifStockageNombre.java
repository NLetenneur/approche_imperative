package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ecrire 1 pour ajouter un nombre, 2 pour consulter le tableau des nombres saisis");
		int nb = scanner.nextInt();
		int[] tab = new int[0];
		while ((nb != 2) && (nb != 1)) {
			System.out.println("Ecrire 1 pour ajouter un nombre, 2 pour consulter le tableau des nombres saisis");
			nb = scanner.nextInt();
		}
		while (nb != 2) {
			while ((nb != 2) && (nb != 1)) {
				System.out.println("Ecrire 1 pour ajouter un nombre, 2 pour consulter le tableau des nombres saisis");
				nb = scanner.nextInt();
			}
			int position = tab.length + 1;
			tab = Arrays.copyOf(tab, tab.length + 1);
			System.out.println("Saisir le nombre à enregistrer");
			tab[position-1] = scanner.nextInt();
			System.out.println("Ecrire 1 pour ajouter un nombre, 2 pour consulter le tableau des nombres saisis");
			nb = scanner.nextInt();
		}
		if (tab.length < 1) {
			System.out.println("Le tableau est vide");
		} else {
			System.out.println("Voici les nombres saisis :");
			for (int i = 0; i < tab.length; i++) {
				System.out.println(tab[i]);
			}
		}

	}

}
