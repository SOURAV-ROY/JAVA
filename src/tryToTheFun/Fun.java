package tryToTheFun;

import javax.swing.JOptionPane;

public class Fun {
	public static void main(String[] args) {
		
		String S = JOptionPane.showInputDialog("Enter a String: ");
		
		int cont = 0;
		while(cont==0)
		{
			String op = JOptionPane.showInputDialog("What do want to do?\n"
					+ "1.String Reverse\n"
					+ "2.Counting the number of characters\n"
					+ "3.Searching a specific character in the string\n\n");
			
			int option = Integer.parseInt(op);
			switch(option)
			{
			case 1:
				Reverse(S);
				break;
		
			case 2:
				Count(S);
				break;
			case 3:
				Search(S);
				break;
			default:
				JOptionPane.showMessageDialog(null, "You have entered a wrong value");
				break;
					
			}
			cont = JOptionPane.showConfirmDialog(null, "Do you want to do more operations on your given string?");
		}
		
	}
	
	public static void Reverse(String input)
	{
		char[] in = input.toCharArray();
		int size = in.length;
	    int start = 0, end = size-1;
	    char temp;
	    
	    while(start<end)
	    {
	    	temp = in[start];
	    	in[start] = in[end];
	    	in[end] = temp;
	    	end--;
	    	start++;
	    }
			
	    String s = String.valueOf(in);
	    JOptionPane.showMessageDialog(null, s);
	    System.out.println();
	}
	
	public static void Count(String input)
	{
		char[] in = input.toCharArray();
		int size = in.length;
		
		JOptionPane.showMessageDialog(null, "The length of your given string is "+ size);
	}
	
	public static void Search(String input)
	{
		String s = JOptionPane.showInputDialog("Enter Your Search Key");
		char a = s.charAt(0);
		char[] in = input.toCharArray();
		int flag = 0;
		for(int i = 0;i<in.length;i++)
		{
			if(a==in[i])
			{
				flag = 1;
				break;
			}
		}
		
		if(flag==1)
			JOptionPane.showMessageDialog(null, "found");
		else
			JOptionPane.showMessageDialog(null, "Not found");
	}
	
}	