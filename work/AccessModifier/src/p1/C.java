//Case-3 : Accessing members from the sub class having same package

package p1;

public class C extends A {

	void m3() {

		System.out.println(a); // YES
		System.out.println(b); // YES
		System.out.println(c); // YES
		System.out.println(d); // NO
	}

}
