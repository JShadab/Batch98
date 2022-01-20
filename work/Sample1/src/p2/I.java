package p2;

@FunctionalInterface
public interface I {

	void method();

	default void f1() {
	}

	static void f2() {
	}

}
