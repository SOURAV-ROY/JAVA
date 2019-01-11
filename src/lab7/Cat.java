package lab7;

public class Cat extends Pet{

	public Cat(String nn, int aa) {
		super(nn, aa);
		super.sound="Meu Meu";
	}
	public void playWith(String play) {
		System.out.println("I am palying with "+play+" My Puppy");
	}

}
