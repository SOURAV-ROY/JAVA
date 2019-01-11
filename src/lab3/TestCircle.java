package lab3;

public class TestCircle {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(15);
		
		System.out.println("Circle 1:\n Radius : "+c1.radius+
				"\n\t Area : "+c1.getArea()+
				"\n\tCircumference : "+c1.getCircumference()+"\n");
		
		System.out.println("Circle 2:\n Radius : "+c2.radius+
				"\n\t Area : "+c2.getArea()+
				"\n\t Circumference : "+c2.getCircumference()+" \n");

		refTestCircle(c1,c2);
		
		System.out.println("After ref test: \n");
		System.out.println("Circle 1:\n Radius : "+c1.radius+
				"\n\t Area : "+c1.getArea()+
				"\n\tCircumference : "+c1.getCircumference()+"\n");
		
		System.out.println("Circle 2:\n Radius : "+c2.radius+
				"\n\t Area : "+c2.getArea()+
				"\n\t Circumference : "+c2.getCircumference());

	}
	public static void refTestCircle(Circle circle1, Circle circle2) {
		circle1.radius=circle2.radius;
		
	}

}
