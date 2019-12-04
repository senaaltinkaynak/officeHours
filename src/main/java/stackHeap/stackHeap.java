package stackHeap;

import java.util.Arrays;

public class stackHeap {
	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1; // sayi2 = 10;
		sayi1 = 30;
		System.out.println("sayi1 = " + sayi1);
		System.out.println("sayi2 = " + sayi2);

		System.out.println("**************************");
		
		int[] array1 = new int[] { 1, 2, 3 };
		int[] array2 = new int[] { 5, 6, 7 };
		array2 = array1;
		array1[2] = 30;
		array1[0] = 10;
		array1[1] = 20;
		System.out.println("array1 = " + Arrays.toString(array1));
		System.out.println("array2 = " + Arrays.toString(array2));

	}
}
