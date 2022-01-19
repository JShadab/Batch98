package jan18;

public class Test11 {

	public static void main(String[] args) {
		
		Test11 obj = new Test11();
		
		int x = obj.sum1(5, 20);
		System.out.println(x);
	}

	public int sum1(int a, int b) {
		return (a + b);
	}

	private void sum2(int a, int b) {
		System.out.println(a + b);
	}
}
