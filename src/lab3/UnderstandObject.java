package lab3;

import javax.swing.JFrame;

public class UnderstandObject {

	public static void main(String[] args) {
		
		// Primitive Data Type	
//		int i=100;
//		double d =10.12;
		
		//Object Data Type
		String s1="Hello Sourav";
		System.out.println("Charecter count of S1 = " +s1.length());
		
		String s2 = new String("Hello!! Sourav");
		System.out.println("Charecter count of S2 = " +s2.length());
		
		//Another Objects
		JFrame jf=new JFrame("Test Windows");
		jf.setVisible(true);
		jf.setSize(400, 600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
