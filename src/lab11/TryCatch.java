package lab11;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
//		while(true){
//		Scanner sou = new Scanner(System.in);
//		System.out.println("Enter S & M: ");
//		double s = sou.nextDouble();
//		double m = sou.nextDouble();
//		sou.nextLine();
//		
//		try {
//			System.out.println(s/m);
//		} catch (ArithmeticException ex) {
//			System.out.println("M is not zero");
//			//ex.setStackTrace(null);
//		}
//
//	  }
		while(true)
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter X & Y : ");
			
			int x = input.nextInt();
			int y = input.nextInt();
			
			input.nextLine();
	try {
		
		System.out.println(posDIV(x, y));
		
	} catch (ArithmeticException ae) {
		
		System.out.println("Y can nor be zero");
		
	}catch (IllegalArgumentException e) {
		
		System.out.println("X Y can not be negetive");
		}
//	input.close();
	}
}
	public static int posDIV(int a, int b)throws IllegalArgumentException, ArithmeticException{
		
		if (a < 0 || b < 0) 
			
			throw new IllegalArgumentException();
		
			return a/b;
			
	}
	
}
