package p1;

public class Test2 {

	public static void main(String[] args) {

		int i = 10;
		
		//Convert Numeric value into String type
		
	//	String x = i + "";
		String x = String.valueOf(i);
		System.out.println(x);
		
		
		//Convert String value into numeric type
		String y = "101";
		//Integer j = new Integer(y);
		
		int j = Integer.parseInt(y);
		System.out.println(j);
		
		Integer k = Integer.valueOf(y);
		System.out.println(k);
	}

}
