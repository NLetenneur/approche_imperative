package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		int[] tab= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 System.out.println(tab[0]);
		 System.out.println(tab.length);
		 System.out.println(tab[tab.length -1]);
		 System.out.println(tab[4]);
		 tab[4]=8;
		 System.out.println(tab[4]);
		 
		 for (int i=0; i<10; i++) {
			 if (tab[i]>3){
				 System.out.println(tab[i]);
			 }
		 }
		 for (int i=0; i<10; i++) {
			 if (tab[i]%2==0){
				 System.out.println(tab[i]);
			 }
		 }
		 for (int i=0; i<10; i++) {
			 if (i%2==0){
				 System.out.println(tab[i]);
			 }
		 }
		 for (int i=0; i<10; i++) {
			 if (tab[i]%2==1){
				 System.out.println(tab[i]);
			 }
		 }
	}

}
