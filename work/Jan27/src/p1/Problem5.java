//5. How to merge two arrays?
package p1;

import java.util.Arrays;
import java.util.Iterator;

public class Problem5 {

	public static void main(String[] args) {

		int[] arr1 = { 90, 80, 70, 60 };
		int[] arr2 = { 15, 25, 35 };

		int[] arr3 = new int[arr1.length + arr2.length];

		// filling merged array with first arr
		for (int i = 0; i < arr1.length; i++) {

			arr3[i] = arr1[i];
		}
		// arr3 -> [90, 80, 70, 60, 0 , 0, 0]
		System.out.println(Arrays.toString(arr3));

		for (int i = 0; i < arr2.length; i++) {

			arr3[i + arr1.length] = arr2[i];
		}

		// arr3 -> [90, 80, 70, 60, 15 , 25, 35]
		 System.out.println(Arrays.toString(arr3));
		 
		for (int x : arr3) {
			System.out.println(x);

		}

		Arrays.stream(arr3).forEach(System.out::println);

	}

}
