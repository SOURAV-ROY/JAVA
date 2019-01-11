package lab16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataSaveWrite {

	public static void main(String[] args) {
		
		DataSave ds = new DataSave(123456789, "SOURAV","Banglay","Kotha Boli");
		
		try {
			
			FileOutputStream fos = new FileOutputStream("H:\\JAVA\\src\\lab16\\save.data");
			ObjectOutputStream write = new ObjectOutputStream(fos);
			
			write.writeObject(ds);
			
			write.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}

	}

}
