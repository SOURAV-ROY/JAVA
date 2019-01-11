package lab12;

import java.util.Random;
import java.util.Scanner;

public class Task1ArrayErrorHandling {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		
		Random randon = new Random();
		
		for(int i=0; i<100; i++){
			
			array[i] = randon.nextInt(1000);
		}
		
		Scanner input = new Scanner(System.in);	
		
		//while(true){
		
		try {
			System.out.println("Enter the index of your array");
			
			int index;
			index = input.nextInt();
			
			System.out.println("Array of index " +index+ " is "+array[index]);
			
		} catch (ArrayIndexOutOfBoundsException sourav) {
			
			System.out.println("Array index of bound\n"+
									    "GetMassage = "+sourav.getMessage()+"\n"+
									    "GetLocalizedMessag = "+sourav.getLocalizedMessage()+"\n"+
										"HashCode = "+sourav.hashCode()+"\n"+
									    "ToString"+sourav.toString()+"\n"+
										"Equals ObjectSourav = "+sourav.equals(sourav)+"\n"+
										"Equals Input = "+sourav.equals(input)+"\n"+
										"Equals Random = "+sourav.equals(randon)+"\n"+
										"Equals Array = "+sourav.equals(array)+"\n"+
										"Equals SOURAV = "+sourav.equals(sourav));
			
		}
    }

}
