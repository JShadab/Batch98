package p1;

public class Car {

	String company;

	Engine engine;

	void drive() {

		engine.start();

		System.out.println("Car is moving...");

	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
