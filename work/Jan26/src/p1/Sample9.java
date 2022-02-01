//WAP to Reverse an array.

package p1;

import java.util.Arrays;

public class Sample9 {

	public static void main(String[] args) {

		String[] names = { "JavaSE", "JavaEE", "JavaME", "Angular", "React" };

		int size = names.length;

		// output = [ "React", "Angular", "JavaME", "JavaEE" , "JavaSE"];

		String[] reversed = new String[size];

		for (int i = 0; i < names.length; i++) {

			reversed[size - i - 1] = names[i];

		}

		System.out.println("Original : " + Arrays.toString(names)); // [JavaSE, JavaEE, JavaME, Angular, React]
		System.out.println("Reversed : " + Arrays.toString(reversed)); // [React, Angular, JavaME, JavaEE, JavaSE]

	}

}
