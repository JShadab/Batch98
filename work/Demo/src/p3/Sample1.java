package p3;

public class Sample1 {

	public static void main(String[] args) {

//		Playable playable = new Cricket();
//		playable.play();

//		Playable playable = new Playable() {
//			@Override
//			public void play() {
//				System.out.println("Plyimng from annonymous class");
//			}
//		};
//		playable.play();

		Playable playable = () -> System.out.println("Playing from Lambda");

		playable.play();

	}

}


interface Playable {
	void play();
}

class Cricket implements Playable {

	@Override
	public void play() {
		System.out.println("Plying Cricket");

	}
}