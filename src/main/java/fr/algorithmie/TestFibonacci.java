package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir un rang de la suite de Fibonacci");
		double nb = scanner.nextInt();
		double[] tab = {0,1};
		tab = Arrays.copyOf(tab, tab.length + 1);
		for (int i=2; i<nb; i++) {
			if (i>=tab.length) {
				tab = Arrays.copyOf(tab, tab.length + 1);
			}
			tab[i]=tab[i-2]+tab[i-1];
		}
		System.out.println("Le nombre correspondant au rang "+nb+" de la suite de Fibonacci est "+tab[tab.length-1]);
	}

}
