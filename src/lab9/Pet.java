package lab9;

public abstract class Pet implements Animal{
	
	private String name;
	private int age;
	private String color;

	public Pet(String n, int a, String c) {
		this.name=n;
		this.age=a;
		this.color=c;
	}
	
	public void setName(String nm) {
		this.name=nm;
	}
	public void setAge(int ag) {
		this.age=ag;
	}
	public void setColor(String cr) {
		this.color=cr;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	public abstract String howPlays();

}
