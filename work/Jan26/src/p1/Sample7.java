//WAP to To take an Integer value from user input.
// and calculate its factorial. example factorial of 5 is = 5 * 4 * 3 * 2 * 1

package p1;

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer values");
		int num = sc.nextInt();

		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}

		System.out.println("FACTORIAL of " + num + " is " + fact);

		sc.close();

	}

}
