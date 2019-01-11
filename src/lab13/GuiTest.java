package lab13;

//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GuiTest {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("ADD & SUB");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		mainFrame.setLayout(new FlowLayout());
//		mainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
//		mainFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		mainFrame.setLayout(new GridLayout(2,3));
		
		JTextField jtf_a = new JTextField();
		JTextField jtf_b = new JTextField();
		
		JButton jbt_addition = new JButton("+");
		JButton jbt_sub = new JButton("-");
		
		JLabel result = new JLabel("Result");
		
		jbt_addition.addActionListener(new ActionListener() {	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(jtf_a.getText());
				int b = Integer.parseInt(jtf_b.getText());
				
				result.setText(" "+(a+b));	
			}
		});
		
		jbt_sub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(jtf_a.getText());
				int b = Integer.parseInt(jtf_b.getText());
				
				result.setText(" "+(a-b));
			}
		});
		
		mainFrame.add(jtf_a);
		mainFrame.add(jtf_b);
		
		mainFrame.add(result);
		
		mainFrame.add(jbt_addition);
		mainFrame.add(jbt_sub);
		
		mainFrame.setSize(400, 300);
		mainFrame.setVisible(true);

	}

}
