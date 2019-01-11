package everyPersonDetails;

public class Employee extends Person {
	
	private String office;
	private double salary;
	private java.util.Date dateHired;
	
	public Employee(String name, String add, String num, String mail, String off, double sal) {
		
      //super(name, add, num, mail);
		super(name, add, num, mail);
		
		this.office = off;
		this.salary = sal;
		dateHired = new java.util.Date();
	}
	
//	public Employee() {
//		
//		super();
//		this.office = "Not Given";
//		this.salary = 0.0;
//	}
	
	public String getOffice() {
		
		return office;
	}
	
	public void setOffice(String off) {
		
		this.office = off;
	}
	
	public double getSalary() {
		
		return salary;
	}
	
	public void setSalary(double sal) {
		
		this.salary = sal;
	}
	
	public java.util.Date getDateCreated() {
		
		return dateHired;
	}
	
	public String toString() {
		
		return super.toString() + "\nOffice : " + office + "\nSalary : " + salary + "\nDate Hired : " + dateHired;
	}
}
