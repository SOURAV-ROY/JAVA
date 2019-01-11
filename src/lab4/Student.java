package lab4;

public class Student {
	private String name,gender,dep;
	int age;
	
	public Student() {
		this.name="Sourav";
		this.gender="M";
		this.dep="CSE";
		this.age= 22;
	}
	public Student(String n, String g, String d, int a) {
		this.name = n;
		this.gender = g;
		this.dep = d;
		this.age = a;
	}
	public void souDetails() {
		System.out.println("Name : "+name+"\n"+
							"Gender : "+gender+"\n"+
							"Dep : "+dep+"\n"+
							"Age : "+age);
		
	}

}
