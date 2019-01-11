package lab7;

public class PetMain {

	public static void main(String[] args) {
		Dog d = new Dog("Tiger", 10);
		Cat c = new Cat("TunTuni", 5);

		d.fetch("Stick Hahahaha");
		System.out.println("Name: "+d.name);
		System.out.println("Age: "+d.getAge());
		System.out.println("Sound: "+d.sound);

		System.out.println();
		
		c.playWith("MY Cat");
		System.out.println("Name: "+c.name);
		System.out.println("Age: "+c.getAge());
		System.out.println("Sound: "+c.sound);

	}

}
