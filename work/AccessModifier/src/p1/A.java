//Case-1 : Accessing members from the same class

package p1;

public class A {

	public int a;
	protected int b;
	int c;
	private int d;

	void m1() {

		System.out.println(a); // YES
		System.out.println(b); // YES
		System.out.println(c); // YES
		System.out.println(d); // YES
	}

}
