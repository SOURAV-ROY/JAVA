package lab8;

public class MainPet {

	public static void main(String[] args) {
		
		Puppy pp= new Puppy("PUPPYTAPPY", "BROWN", "HUNG", 10);
		
		System.out.println("Name = "+pp.name);
		System.out.println("Color = "+pp.color);
		System.out.println("Breed = "+pp.breed);
		System.out.println("Age = "+pp.age);
		
		System.out.println("Noise = "+pp.makeNoise());
	}

}
