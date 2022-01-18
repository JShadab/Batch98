package jan18;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// Print sum of numbers starting from 1 to 10 -> 55

		int sum = 0;

		int i = 11;

		do {

			sum = sum + i;

			i++;
		} 
		while (i <= 10);

		System.out.println(sum);

	}

}
