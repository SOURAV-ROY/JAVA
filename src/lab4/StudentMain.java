package lab4;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.souDetails();
		System.out.println();

		Student s2 = new Student("ROY","F","CSE",20);
		s2.souDetails();
		System.out.println();

		Student s3 = new Student();
		s3.souDetails();

	}

}
