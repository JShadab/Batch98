package jan19;

public class A {

	public A() {
		this(99);
		System.out.println("Default Constructor");

	}

	public A(int x) {
		this(x, 76);
		System.out.println("one parameter Constructor");

	}

	public A(int x, int y) {
		super();
		System.out.println("two parameter Constructor");
	}

	public static void main(String[] args) {

		// A a1 = new A();
		// A a2 = new A(5);
		A a3 = new A(5, 10);

	}

}
