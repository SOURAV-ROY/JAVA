package lab1;

import javax.swing.JOptionPane;

public class Task1 {
	public static void evenOdd(int num) {
		
		if (num % 2 == 0) 
			JOptionPane.showMessageDialog(null, "Even Number");
			else 
				JOptionPane.showMessageDialog(null, "Odd Number");
		
	}

	public static void main(String[] args) {
		String input;
		int num;
		
		input=JOptionPane.showInputDialog("Enter An Integer");
		num=Integer.parseInt(input);
		
		evenOdd(num);

	}

}
