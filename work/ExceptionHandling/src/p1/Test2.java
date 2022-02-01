package p1;

public class Test2 {

	public static void main(String[] args) {

		System.out.println("Before Main");
		f1();
		System.out.println("After Main");
	}

	private static void f1() {
		System.out.println("Before F1");
		f2();
		System.out.println("After F1");

	}

	private static void f2() {
		
		System.out.println("Before F2");

		int a = 10;
		int b = 0;

		int c = a / b;

		System.out.println(c);

		System.out.println("After F2");

	}

}
