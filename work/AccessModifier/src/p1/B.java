//Case-2 : Accessing members from the another class having same package

package p1;

public class B {

	void m2() {

		A obj = new A();

		System.out.println(obj.a); // YES
		System.out.println(obj.b); // YES
		System.out.println(obj.c); // YES
		System.out.println(obj.d); // NO
	}

}
