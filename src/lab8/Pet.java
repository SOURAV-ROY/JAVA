package lab8;

public abstract class Pet {
		public String name;
		public String color;
		public String breed;
		protected int age;
		
	public Pet(String n, String c, String b, int a) {
		this.name=n;
		this.color=c;
		this.breed=b;
		this.age=a;
	}
	public int age() {
		return age;
	}
	
//	public abstract String makeNoise();

}
