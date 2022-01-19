//Case-5 : Accessing members from the another class from different package

package p2;

import p1.A;

public class E {

	void m5() {
		
		A obj = new A();

		System.out.println(obj.a); // YES
		System.out.println(obj.b); // NO
		System.out.println(obj.c); // NO
		System.out.println(obj.d); // NO
	}

}
