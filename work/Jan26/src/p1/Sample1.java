//WAP to print sum of 1 to 10 numbers using a)WHILE loop b) DO-WHILE loop

package p1;

public class Sample1 {
	
	public static void main(String[] args) {
		
		int sum =0;
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			
		}
		
		System.out.println(sum);//55
	}

}
