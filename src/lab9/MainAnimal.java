package lab9;

public class MainAnimal {

	public static void main(String[] args) {
		Dog d = new Dog("Tiger", 10, "Black");
		
		Tiger t = new Tiger();
		
		System.out.println("Name : " +d.getName());
		System.out.println("age : " +d.getAge());
		System.out.println("Color : " +d.getColor());
		System.out.println("Play : " +d.howPlays());
		System.out.println("Name : " +d.makeNoise());
		
		System.out.println();
		
		System.out.println("Name : "+t.makeNoise());
		
	}

}
