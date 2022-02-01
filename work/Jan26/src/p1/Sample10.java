//WAP to Reverse an array.

package p1;

import java.util.Arrays;

public class Sample10 {

	public static void main(String[] args) {

		String[] names = { "JavaSE", "JavaEE", "JavaME", "Angular", "React" };

		System.out.println("Original : " + Arrays.toString(names)); // [JavaSE, JavaEE, JavaME, Angular, React]

		int size = names.length;

		for (int i = 0; i < size / 2; i++) {

			String first = names[i];
			String last = names[size - i - 1];

			names[size - i - 1] = first;
			names[i] = last;

		}

		System.out.println("Reversed : " + Arrays.toString(names)); // [React, Angular, JavaME, JavaEE, JavaSE]

	}

}
