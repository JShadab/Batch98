package p1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args) throws IOException {

		f1();
		f5();

	}

	private static void f1() {

		int a = 10;
		int b = 0;

		if (b != 0) {
			int c = a / b;
			System.out.println(c);
		}

	}

	private static void f3() {

		String name = "Shadab";
		System.out.println(name.length());// 6

		String x = null;
		if (x != null) {
			System.out.println(x.length());
		} // ? NullPointerException

	}

	private static void f4() {

		int[] arr = { 4, 7, 3, 9, 23, 67 }; // 0 to 5

		System.out.println(arr.length);// 6

		System.out.println(arr[6]);// ArrayIndexOutofBoundsException
		System.out.println(arr[-1]);// AIOBE

	}

	private static void f5() throws IOException {

		f2();

	}

	private static void f2() throws IOException{

		FileReader fr = new FileReader(new File("shadab.java"));

	}

}
