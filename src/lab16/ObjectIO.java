package lab16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {

	public static void main(String[] args) {
		
		try {
			String list[] = new String[5];
			
			list[0]="Item1";
			list[1]="Item2";
			list[2]="Item3";
			list[3]="Item4";
			list[4]="Item5";
			
			String location = "H:\\JAVA\\src\\lab16\\ObjectIO.dat";
			
			ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(location));
			ous.writeObject(list);
			ous.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(location));
			String newList[];
			
			newList = (String[]) ois.readObject();
			ois.close();
			
			for(String item: newList){
				System.out.println(item);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
