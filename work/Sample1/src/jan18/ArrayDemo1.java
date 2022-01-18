package jan18;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] nums = new int[5];

		nums[0] = 99;
		nums[1] = 65;
		nums[2] = 87;
		nums[3] = 13;
		nums[4] = 18;

		System.out.println("========== Way #1 using for loop =========");

		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			System.out.println(x);
		}

		System.out.println("========== Way #2 using forEach loop =========");

		for (int x : nums) {
			System.out.println(x);
		}

	}

}
