package p1;

public class Test {

	public static void main(String[] args) {

//		Car car = new Car();
//		
//		Engine engine = new Engine();		
//		car.setEngine(engine); // setter dependency

		Engine engine = new Engine();
		Car car = new Car(engine); // constructor dependency

		car.drive();
	}

}
