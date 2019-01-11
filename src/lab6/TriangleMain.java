package lab6;

public class TriangleMain {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle();
		triangle1.setSide1(3);
		triangle1.setSide2(4);
		triangle1.setSide3(5);
		
		Triangle triangle2 = new Triangle();
		triangle2.setSide1(20);
		triangle2.setSide2(20);
		triangle2.setSide3(20);

		Triangle triangle3 = new Triangle();
		triangle3.setSide1(60);
		triangle3.setSide2(40);
		triangle3.setSide3(20);
		
		System.out.println("Area of triangle no 1: " + triangle1.getArea());
		System.out.println("Area of triangle no 2: " + triangle2.getArea());
		System.out.println("Area of triangle no 3: " + triangle3.getArea());
		
		System.out.println("Perimeter of triangle no 1: " + (int) triangle1.getPerimeter());
		System.out.println("Perimeter of triangle no 2: " + (int) triangle2.getPerimeter());
		System.out.println("Perimeter of triangle no 3: " + (int) triangle3.getPerimeter());
		
		if (triangle1.isRightTriangles() == true)
			System.out.println("Triangle 1 is a right triangle.");
		else
			System.out.println("Triangle 1 is not a right triangle.");
		
		if (triangle2.isRightTriangles() == true)
			System.out.println("Triangle 2 is a right triangle.");
		else
			System.out.println("Triangle 2 is not a right triangle.");
		
		if (triangle3.isRightTriangles() == true)
			System.out.println("Triangle 3 is a right triangle.");
		else
			System.out.println("Triangle 3 is not a right triangle.");
	}

}
