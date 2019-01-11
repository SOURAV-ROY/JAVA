package mtd;

public class AgeComparer implements IComparer{
	
	public boolean compare(Person p){
		
		return p.age>22;
	}
}
