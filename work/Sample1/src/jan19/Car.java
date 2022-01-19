package jan19;

public class Car {

	int h;
	int w;

	public Car() {
		this.h = 5;
		this.w = 15;
	}

	public Car(int x, int y) {
		this.h = x;
		this.w = y;
	}

	public void display() {
		System.out.println(h + " - " + w);

	}

}
