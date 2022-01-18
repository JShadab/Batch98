// 10. Write a program in Java to input 5 numbers from keyboard store in an array and find their sum and average.
package jan18;

import java.util.Arrays;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter a numer");

			arr[i] = sc.nextInt();

		}
		sc.close();

		System.out.println(Arrays.toString(arr));

		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("SUM = " + sum);
		
		double avg = sum / arr.length;
		System.out.println("AVG = " + avg);

	}

}
