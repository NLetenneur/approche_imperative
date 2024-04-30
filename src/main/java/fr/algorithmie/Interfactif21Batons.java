package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int batons = 21;
		int choixJoueur=0;
		int choixOrdi=0;
		while (batons >0) {
			System.out.println("Combien de bâtons voulez-vous prendre ? (1, 2 ou 3)");
			choixJoueur = scanner.nextInt();
			while (choixJoueur!=1&&choixJoueur!=2&&choixJoueur!=3) {
				System.out.println("Vous devez prendre un, deux ou trois bâtons. Combien de bâtons voulez-vous prendre ?");
				choixJoueur = scanner.nextInt();
			}
			batons= batons-choixJoueur;
			System.out.println("Vous avez pris "+choixJoueur+" bâtons. Bâtons restant : "+batons);
			if (batons>0) {
				choixOrdi = rand.nextInt(3)+1;
				batons= batons-choixOrdi;
				System.out.println("L'ordinateur a pris "+choixOrdi+" bâtons. Bâtons restant : "+batons);
			}else {
				choixOrdi = 10;
			}
			
			
		}
		if (choixOrdi == 10) {
			System.out.println("Perdu ! Vous avez pris le dernier bâton.");
		}else {
			System.out.println("Gagné ! L'ordinateur a pris le dernier bâton.");
		}
	}

}
