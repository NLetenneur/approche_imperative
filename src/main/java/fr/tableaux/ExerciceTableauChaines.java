package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {

	public static void main(String[] args) {

			String[] villes = {"Tours", "Montpellier", "Nîmes", "Nantes", "Lyon"};
			System.out.println(villes[0]);
			System.out.println(villes[1]);
			System.out.println(villes[2]);
			System.out.println(villes[3]);
			System.out.println(villes[4]);
			System.out.println(villes.length);
			System.out.println(Arrays.toString(villes));
			
			villes[3] = "Reims";
			System.out.println(Arrays.toString(villes));

			
			
	}

}
