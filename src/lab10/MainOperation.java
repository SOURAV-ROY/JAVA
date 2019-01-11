package lab10;

import javax.swing.JOptionPane;

public class MainOperation {

	public static void main(String[] args) {
		
		BInaryOperation b = new BInaryOperation();
		TrinaryOperation t = new TrinaryOperation();

		double num1, num2, num3;
		String num;
		
		num = JOptionPane.showInputDialog("Enter the First  number");
		num1 = Integer.parseInt(num);
		
		num = JOptionPane.showInputDialog("Enter the Second  number");
		num2 = Integer.parseInt(num);
		
		num = JOptionPane.showInputDialog("Enter the Third  number");
		num3 = Integer.parseInt(num);
			
		JOptionPane.showMessageDialog(null, "Additional Of Binary number : "+b.add(num1, num2));
		
		JOptionPane.showMessageDialog(null, "Subtaction Of Binary number : "+b.sub(num1, num2));
		
		JOptionPane.showMessageDialog(null, "Additional Of Trinary number : "+t.add(num1, num2,num3));
		
		JOptionPane.showMessageDialog(null, b.toString());
		JOptionPane.showMessageDialog(null, t.toString());
		
	}

}
