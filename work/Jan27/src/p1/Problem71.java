// 7. How to check if two arrays are equal or not?
package p1;

public class Problem71 {

	public static void main(String[] args) {
		int[] arr1 = { 4, 5 };
		
		int[] arr2 = { 5, 4};

		if (arr1.length != arr2.length) {
			System.out.println("Arrays are not equal");
			return;
		}

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != arr2[i]) {

				System.out.println("Arrays are not equal");
				return;
			}

		}
		System.out.println("Arrays are equal");

	}

}
