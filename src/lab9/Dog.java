package lab9;

public class Dog extends Pet implements Animal{

	public Dog(String name, int age, String color) {
		
		super(name, age, color);
	}
	public String makeNoise() {
		
		return "Woof Woof";
	}
	public String howPlays() {
		
		return "Plays by fetching something";
	}

}
