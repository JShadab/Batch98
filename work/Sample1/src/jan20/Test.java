package jan20;

public class Test {

	public static void main(String[] args) {

		int i = 11;
		final int j = 100;

		System.out.println(i); // 11

		i = 22;
		// j = 150; //error
		System.out.println(i); // 22

		System.out.println("---------------------------");

		A a = new A();
		a.foo();
		a.greet();

		System.out.println("---------------------------");

		B b = new B();
		b.foo();
		b.greet();

	}

}
