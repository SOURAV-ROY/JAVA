package lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteInFile {

	public static void main(String[] args) {
		
		File outFile = new File("\\save.txt");
		
		try {
			
			PrintWriter write = new PrintWriter(outFile);
			
			write.println("Sourav Write");
			write.println("Sourav");
			
			write.println("Roy Write");
			write.println("Roy");
			
			write.println("Sou Write");
			write.println("Sou");
			
			write.println("AMI");
			
			write.close();
			
		} catch (FileNotFoundException sou) {
			
			// TODO Auto-generated catch block
			
			sou.printStackTrace();
			sou.getMessage();
		}

	}

}
