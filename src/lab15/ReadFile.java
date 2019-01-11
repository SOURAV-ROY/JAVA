package lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		File inFile = new File("\\save.txt");
		
//		File inFile = new File(ReadFile.class.getResource("/lab15/save.txt"));
		
		try {
			Scanner input = new Scanner(inFile);
			
//			System.out.println(input.nextLine());
//			System.out.println(input.nextLine());
//			System.out.println(input.nextLine());
//			System.out.println(input.nextLine());
//			System.out.println(input.nextLine());
//			System.out.println(input.nextLine());
			
//			String s = input.nextLine();
//			System.out.println(s);
//			String m = input.nextLine();
//			System.out.println(m);
			
			while (input.hasNextLine()) {
				
				System.out.println(input.nextLine());
			}
					
			input.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
			e.getClass();
		}

	}

}
