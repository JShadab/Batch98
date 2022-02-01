//WAP to print sum of 1 to 10 numbers using a)WHILE loop b) DO-WHILE loop

package p1;

public class Sample3 {

	public static void main(String[] args) {

		int sum = 0;

		int i = 1;

		do {
			sum = sum + i;
			i++;
		} while (i <= 10);

		System.out.println(sum);// 55
	}

}
