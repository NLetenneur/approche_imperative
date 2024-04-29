package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		
		int[] tab1 = {8,-7,12,1,-2,14,17,9};
		System.out.println(tab1[0]);
		System.out.println(tab1.length);
		System.out.println(tab1[tab1.length -1]);
		System.out.println(tab1[10]); //ne peut pas fonctionner parce que le tableau ne contient que 8 entrées
	}

}
