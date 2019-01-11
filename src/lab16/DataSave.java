package lab16;

import java.io.Serializable;

public class DataSave implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
		int ami;
		String banglay;
		String kotha;
		String boli;
	
	public DataSave(int a, String b, String c, String d) {
		
		this.ami = a;
		this.banglay = b;
		this.kotha= c ;
		this.boli= d ;
	}

}
