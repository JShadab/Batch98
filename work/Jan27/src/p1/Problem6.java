//6. How to find only extra element?
package p1;

public class Problem6 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 3, 7, 1, 2, 4 };

		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}

		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum2 = sum2 + arr2[i];
		}

		int extraElement = sum2 - sum1;
		System.out.println(extraElement);

	}

}
