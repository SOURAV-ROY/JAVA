package lab5;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rectangle[] rectangle = new Rectangle[3];
		
		for (int i = 0; i<rectangle.length; i++) {
			System.out.println("Enter the hight & width of the rectangle : "+ (i+1));
			
			double height= input.nextDouble();
			double width= input.nextDouble();
			
			rectangle[i]= new Rectangle(height, width);
			
			System.out.println("Area Of the Rectangle "+ (i+1) +" is :> "+rectangle[i].getArea()+"\n");
		}
		input.close();
	}
}
