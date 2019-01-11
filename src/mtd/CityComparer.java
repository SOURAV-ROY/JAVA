package mtd;

public class CityComparer implements IComparer{
	
	public boolean compare(Person p){
		
		return p.city.equals("Dinajpur");
	}
}
