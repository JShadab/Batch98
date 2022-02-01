//WAP to To take 5 subjects marks from user input.
// and print total marks and percentage.

package p1;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for (int x = 1; x <= 5; x++) {

			System.out.println("Enter marks of Subject-" + x);

			int a = sc.nextInt();

			sum = sum + a;
		}

		double percentage = (sum / 500.0) * 100;

		System.out.println("The SUM is " + sum + " and PERCENTAGE is " + percentage);

		sc.close();

	}

}
