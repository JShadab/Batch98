package p2;

class Parent {
	A sum(int a, int b) {
		System.out.println(a + b);
		return null;
	}

}

class child extends Parent {
	B sum(int a, int b) {
		System.out.println(a * b);
		return null;
	}

}