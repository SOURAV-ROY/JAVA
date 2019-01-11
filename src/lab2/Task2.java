package lab2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entere The number: ");
		int n=input.nextInt();
		input.close();
		
		int sum=0;
		
		for (int i = 0; i <= n ; i++) {
			sum=sum+i;
		}
		System.out.println("Submission Result: "+sum);

	}

}
