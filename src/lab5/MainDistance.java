package lab5;

import java.util.Scanner;

public class MainDistance {

	public static void main(String[] args) {
		PointDistance point = new PointDistance(2.5, 3.4);
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter The Points X & Y: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		//input.close();
		
		System.out.println("Distance Between The Points: "+point.getDistance(x, y));
		
		input.close();
	}

}
