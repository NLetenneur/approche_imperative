package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		boolean isEgalSix = false;
		if ((array.length>0)&&((array[0]==6)||(array[array.length-1]==6))) {
			isEgalSix=true;
		}
		System.out.println(isEgalSix);
	}

}
