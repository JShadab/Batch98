//2. Write a Java program to solve quadratic equations

package jan18;

public class Test2 {

	public static void main(String[] args) {

		// For a quadratic equation ax2 + bx + c = 0, The roots are calculated using the
		// formula, x = (-b ± √ (b² - 4ac) )/2a.

		double a = 1;
		double b = -7;
		double c = 10;

		// Discriminant is, D = b2 - 4ac. If D > 0

		double D = b * b - 4 * a * c;

		double sqrtOfD = Math.sqrt(D);

		double x1 = (-b + sqrtOfD) / (2 * a);
		double x2 = (-b - sqrtOfD) / (2 * a);

		System.out.println(x1 + " , " + x2);

	}

}
