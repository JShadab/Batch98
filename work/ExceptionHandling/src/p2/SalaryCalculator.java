package p2;

public class SalaryCalculator {

	public static void main(String[] args) {

		double totalSal = calcSalary(-100);
		System.out.println(totalSal);// ?
	}

	private static double calcSalary(int basic) {

		// forgiveness
//		if(basic <= 0) {
//			System.out.println("Bhai Sahab, basic salary cannot be zero or negative");
//			return 0;
//		}

		// Punishment
		if (basic <= 0) {
			MyException exp = new MyException("Sale, basic salary cannot be zero or negative");
			throw exp;
		}

		double total = basic * 2 + 50;

		return total;
	}

}
