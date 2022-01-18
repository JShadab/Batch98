//3. Take three numbers from the user and print the greatest number.

package jan18;

public class Test3 {

	public static void main(String[] args) {

		int a = 65, b = 34, c = 5;

		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//		if (a > b) {
//
//			if (a > c) {
//				max = a;
//			} else {
//				max = c;
//			}
//
//		} else {
//			if (b > c) {
//				max = b;
//			} else {
//				max = c;
//			}
//		}

		System.out.println(max);

	}

}
