package everyPersonDetails;

public class Main {

	public static void main(String[] args) {
		
//		Person p = new Person("SOURAV", "Uttara", "01687419560", "roy.sourav@gmail.com");
		
		Students s = new Students("SOURAV","Uttara", "01687419560", "roy.sourav@gmail.com", "Senior");
		
		Employee e = new Employee("SOURAV", "Uttara", "01687419560", "roy.sourav@gmail.com", "NSU", 50000);
		
		Faculty f = new Faculty("SOURAV", "Uttara", "01687419560", "roy.sourav@gmail.com", "NSU", 5000);
		
		Staff sf = new Staff("SOURAV", "Uttara", "01687419560", "roy.sourav@gmail.com", "NSU", 500);
		
//		System.out.println(p.toString() + "\n");
		System.out.println("Student Details>>>>>>>>>>>:");
		System.out.println(s.toString() + "\n");
		System.out.println("Employee Details>>>>>>>>>>:");
		System.out.println(e.toString() + "\n");
		
		System.out.println("Faculty Details>>>>>>>>>>>:");
		System.out.println(f.toString() + "\n");
		
		System.out.println("Staff Details>>>>>>>>>>>>>:");
		System.out.println(sf.toString()+ "\n");
//		System.out.println("ALL IN ALL");
	}

}
