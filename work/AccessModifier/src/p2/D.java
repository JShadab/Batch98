//Case-4 : Accessing members from the sub class from different package

package p2;

import p1.A;

public class D extends A {

	void m4() {

		System.out.println(a); // YES
		System.out.println(b); // YES
		System.out.println(c); // NO
		System.out.println(d); // NO
	}

}
