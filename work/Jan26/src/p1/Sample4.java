//WAP to To take 5 subjects marks from user input.
// and print total marks and percentage.

package p1;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of First Subject");
		int a = sc.nextInt();

		System.out.println("Enter marks of Second Subject");
		int b = sc.nextInt();

		System.out.println("Enter marks of Third Subject");
		int c = sc.nextInt();

		System.out.println("Enter marks of Fouth Subject");
		int d = sc.nextInt();

		System.out.println("Enter marks of Fifth Subject");
		int e = sc.nextInt();

		int sum = a + b + c + d + e;

		double percentage = (sum / 500.0) * 100;

		System.out.println("The SUM is " + sum + " and PERCENTAGE is " + percentage);

		sc.close();

	}

}
