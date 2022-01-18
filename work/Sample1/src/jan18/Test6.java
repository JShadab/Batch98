// 6. Write a Java program that takes a number and print whether that number is a Prime or not.

package jan18;

public class Test6 {

	public static void main(String[] args) {

		int a = 7;

		if ( a < 0 || a == 0 || a == 1) {
			System.out.println("Not Prime");
			return;
		}

	//	boolean isPrime = true;

		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				//isPrime = false;
				break;
			}

		}

//		if (isPrime) {
//			System.out.println("Prime");
//		} else {
//			System.out.println("Not Prime");
//		}
	}

}
