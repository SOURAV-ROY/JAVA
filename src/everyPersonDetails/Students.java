package everyPersonDetails;

public class Students extends Person {
	
	private String status;
	
	public Students(String name, String add, String num, String mail, String st) {
		super(name, add, num, mail);
		this.status = st;
	}
	
	public Students() {
		super();
	}

	public String getStatus() {	
		return status;
	}

	public void setStatus(String status) {	
		this.status = status;
	}
	
	public String toString() {	
		return super.toString() + "\nStatus : " + status;
	}
}
