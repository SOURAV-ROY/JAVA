package lab3;

public class CircleMain {

	public static void main(String[] args) {
		
		// Create a Circle with 5cm radius
		Circle c1 = new Circle();
		
		// Create a Circle with 10cm radius
		Circle c2 = new Circle(10);
		
		System.out.println("Circle 1:\n Radius : "+c1.radius+
				"\n\t Area : "+c1.getArea()+
				"\n\tCircumference : "+c1.getCircumference()+"\n");
		
		System.out.println("Circle 2:\n Radius : "+c2.radius+
				"\n\t Area : "+c2.getArea()+
				"\n\t Circumference : "+c2.getCircumference());

	}

}
