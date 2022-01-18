//4. Write a Java program that takes a year from user and print whether that year is a leap year or not.

package jan18;

public class Test4 {

	public static void main(String[] args) {

		int year = 1900;
		
//		if year is divisible by 400 then is_leap_year
//		else if year is divisible by 100 then not_leap_year
//		else if year is divisible by 4 then is_leap_year
//		else not_leap_year

		if (year % 400 == 0) {
			System.out.println("Leap Year");
		} else if (year % 100 == 0) {
			System.out.println("Not Leap Year");
		} else if (year % 4 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}

	}

}
