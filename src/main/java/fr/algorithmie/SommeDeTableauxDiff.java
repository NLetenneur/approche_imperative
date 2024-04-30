package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		int max1;
		int max2;
		int[] arraySum;
		int[] bigArray;
		if (array1.length>array2.length) {
			arraySum= new int[array1.length];
			max1= array2.length;
			max2=array1.length;
			bigArray=array1;
		}else {
			arraySum= new int[array2.length];
			max1= array1.length;
			max2= array2.length;
			bigArray=array2;
		}
		for (int i=0; i<max1; i++) {
			arraySum[i]=array1[i]+array2[i];
			System.out.println(arraySum[i]);
		}
		for (int i =max1; i<max2; i++) {
			arraySum[i]=bigArray[i];
			System.out.println(arraySum[i]);
		}
		
	}

}
