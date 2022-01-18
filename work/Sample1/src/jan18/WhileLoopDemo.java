package jan18;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// Print sum of numbers starting from 1 to 10 -> 55

		int sum = 0;

		int i = 1;

		while (i <= 10) {
			
			sum = sum + i;

			i++;
		}

		System.out.println(sum);

	}

}
