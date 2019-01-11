package everyPersonDetails;

public class Person {
	
	private String name;
	private String add;
	private String number;
	private String mail;
	
	public Person(String name, String add, String num, String mail) {
		
		this.name = name;
		this.add = add;
		this.number = num;
		this.mail = mail;
	}	
	public Person() {		
		this.name = "Not Given";
		this.add = "Not Given";
		this.number = "Not Given";
		this.mail = "Not Given";
	}
	
	public String getName() {		
		return name;
	}	
	public void setName(String name) {		
		this.name = name;
	}	
	public String getAddress() {		
		return add;
	}	
	public void setAddress(String add) {		
		this.add = add;
	}
	
	public String getNumber() {		
		return number;
	}	
	public void setNumber(String number) {		
		this.number = number;
	}
	
	public String getMail() {		
		return mail;
	}	
	public void setMail(String mail) {	
		this.mail = mail;
	}
	
	public String toString() {
		
		return "Name: " + name + "\nAddress : " + add + "\nPhone Number : " + number + "\nMail Address : " + mail;
	}
}
