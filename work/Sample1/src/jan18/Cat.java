package jan18;

public class Cat {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int x) {
		if(x <= 0) {
			
			System.out.println("How dare you....Kalti....");
			
			return;
		}
		
		this.age = x;
	}

}

class Test {
	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.setAge(10);
	
		
		cat.setAge(-10);

	}
}
