//WAP to To take size of an array.
// fill elements tin the array by user input.
// and calculate sum of array elements and display it

package p1;

import java.util.Arrays;
import java.util.Scanner;

public class Sample8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size for an array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		int sum = 0;

		for (int i = 0; i < size; i++) {

			System.out.println("Enter an element for an array : ");
			int element = sc.nextInt();
			arr[i] = element;
			sum = sum + element;
		}

		System.out.println("SUM = " + sum);
		System.out.println("ARRAY = " + Arrays.toString(arr));

		sc.close();

	}

}
