package mtd;

import java.util.ArrayList;
import java.util.List;

public class Searcher {
	
	public static List<Person> search(List<Person>pr, IComparer ic){
		
		List<Person> list = new ArrayList<Person>();
		
		for (int i = 0; i < pr.size(); i++) {
			
			if (ic.compare(pr.get(i))) {
				
				list.add(pr.get(i));
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Sourav", "Chandra", 23, "Dhaka", "Bangladesh", "Student"));
		
		list.add(new Person("Sou", "Roy", 24, "Dhaka", "Bangladesh", "Student"));
		
		list.add(new Person("Bipul", "Boy", 22, "Dinajpur", "Bangladesh", "Student"));
		
		list.add(new Person("Ami", "Tumi", 20, "Dinajpur", "Bangladesh", "Student"));
		

		List<Person> 
		
		pr = search(list, new AgeComparer());
		System.out.println("Search By Age : ");
		
		for (int i = 0; i < pr.size(); i++) {

			System.out.println(pr.get(i).firstName);
		}
		
		System.out.println();	
	
		pr = search(list, new CityComparer());		
		System.out.println("Search By City : ");
		
		for(int i = 0; i< pr.size(); i++){
			
			System.out.println(pr.get(i).firstName);
		}
	}	
	
		
}

