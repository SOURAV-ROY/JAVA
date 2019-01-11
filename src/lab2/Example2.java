package lab2;

import java.util.Scanner;

public class Example2 {
	
	public static void printSeries(int N) {
		
		int count =0;
		
		while(count <= N){
			System.out.println(" " +count);
			count++;			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner call = new Scanner(System.in);
		
		System.out.println("Entrer The Value: ");
		int value = call.nextInt();

		System.out.println("The Number Start Here: ");
		printSeries(value);
		
		call.close();
	}

}
