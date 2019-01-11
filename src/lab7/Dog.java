package lab7;

public class Dog extends Pet{

	public Dog(String n, int a) {
		super(n,a);
		super.sound="WooF WooF WooF!!";
	}
	public void fetch(String something) {
		System.out.println("I have fatched "+something+" for you");
	}

}
