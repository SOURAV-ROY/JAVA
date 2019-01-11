package lab18;

public class MyClass {
	private static int classCounter = 0;
	private int myCount;
	
	public MyClass() {
		
		myCount=classCounter;
		classCounter++;
	}
	public String toString() {
		return "My class Instance : "+myCount;
	}
}
