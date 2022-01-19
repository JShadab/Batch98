package jan19;

public class Test1 {

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		Test1 obj = new Test1();
		obj.sum(5, 10, 99);
		obj.sum(5, 10);
	}

}
