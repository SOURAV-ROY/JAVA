package lab3;

public class Circle {
	//Define Attributes 
	double radius;
	
	//Define Constructor
	public Circle() {
		radius=5;
	}
	
	//Constructor Overloading 
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	//Defining Methods
	public double getArea() {
		return Math.PI * radius * radius;	
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;	
	}

}
