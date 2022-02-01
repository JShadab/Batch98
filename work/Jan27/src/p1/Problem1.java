//1. How to search an element inside array?
package p1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		int[] arr = { 85, 3, 4, 21, 98, 7, 3, 6, 2, 9, 46 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your key :");

		int x = sc.nextInt();
		int index = -1;//Value not fount at any index
		for (int i = 0; i < arr.length; i++) {

			if (x == arr[i]) {
				index = i;
				//break;
			} 

		}
		
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found at index "+ index);
		}

		sc.close();
	}

}
