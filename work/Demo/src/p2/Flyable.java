package p2;

public interface Flyable {

	void fly();

	default void eat() {
		// -----
	}

	static void speak() {
		// -----
	}

}
