package lab16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DataSaveRead {

	public static void main(String[] args) {
				
		try {
			
			FileInputStream fis = new FileInputStream("H:\\JAVA\\src\\lab16\\save.data");
			
			ObjectInputStream read = new ObjectInputStream(fis);
			
			DataSave dss = (DataSave) read.readObject();
			
			System.out.println(dss.ami+" \n "+dss.banglay+" \n "+dss.kotha+" \n "+dss.boli);
			
			read.close();
			
		} 
		
		catch (IOException | ClassNotFoundException e) {
		
		e.printStackTrace();
		
	}
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			
//			e.printStackTrace();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			
//			e.printStackTrace();
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			
//			e.printStackTrace();
//		}

	}

}
