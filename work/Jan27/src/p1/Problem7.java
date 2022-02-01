//6. How to find only extra element?
package p1;

public class Problem7 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 3, 7, 1, 2, 4, 89, 45 };

		for (int i = 0; i < arr2.length; i++) {

			int x = arr2[i];

			boolean isNotFound = true;

			for (int j = 0; j < arr1.length; j++) {

				if (x == arr1[j]) {
					isNotFound= false;
					break;
				}

			}

			if (isNotFound) {
				System.out.println(x + " is Not Found");
			}

		}

	}

}
