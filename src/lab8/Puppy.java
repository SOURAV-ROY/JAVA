package lab8;

public class Puppy extends Pet{

	public Puppy(String name, String color, String breed, int age) {
		super(name, color, breed, age);
	}
	
//	public int getAge() {
//		return age;
//	}
	
	public String makeNoise() {
		return "Woof Woof";
	}
}
