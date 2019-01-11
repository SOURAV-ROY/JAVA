package lab12;

import java.util.Scanner;

public class DivOperator {
	
	public static double div(double a, double b) throws IllegalArgumentException, 
														IndexOutOfBoundsException{
		if ( b==0) 
			throw new IllegalArgumentException();
		else 
			return a/b;		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 integer nuber");
		
		while(true){
			
		int x = input.nextInt();
		int y = input.nextInt();
		
		try {
			System.out.println("Result of the division "+div(x, y));
			
		} catch (IllegalArgumentException sou) {
			
			System.out.println("B can not  zero >>> "+sou.getMessage());
		}
	  }
   }

}
