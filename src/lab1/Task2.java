package lab1;

import javax.swing.JOptionPane;

public class Task2 {
	
	public static double Converter(int farenheit) {

		double celsius = ((5.0 / 9.0)*(farenheit-32));
		return celsius;
	}

	public static void main(String[] args) {
		String input;
		int f;
		
		input=JOptionPane.showInputDialog("Enter A degree in farenheit");
		f = Integer.parseInt(input);
		double result = Converter(f);
		
		JOptionPane.showMessageDialog(null, "Farenheit == "+f+"\nCelsius == "+result+" Degree");
		

	}

}
