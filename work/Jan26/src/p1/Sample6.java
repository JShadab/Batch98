//WAP to To take an Integer value from user input.
// and print table.

package p1;

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer value: ");
		int x = sc.nextInt();

		for (int c = 1; c < 11; c++) {
			System.out.println(x + " * " + c + " = " + (x * c));

		}

		sc.close();

	}

}
