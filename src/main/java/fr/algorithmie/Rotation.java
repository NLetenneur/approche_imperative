package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(array));
		int temp1 = array[0];
		for (int i=0; i+1<array.length; i++) {
			int temp2=array[i+1];
			array[i+1]=temp1;
			temp1=temp2;
		}
		array[0]=temp1;
		System.out.println(Arrays.toString(array));

	}

}
