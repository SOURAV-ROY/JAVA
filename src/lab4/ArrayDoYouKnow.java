package lab4;

public class ArrayDoYouKnow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[3];
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		
		System.out.println("All Elemnts Declear By Index : ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			
			System.out.println();
		}
		
		System.out.println("All Elements Are Here : ");
		int intArray2[] = {4,5,6,7,8,9};
		for (int i = 0; i < intArray2.length; i++) {
			System.out.print(intArray2[i]);
			
			System.out.println();
		}
		
		System.out.println("Two Dimentional Array");
		int abc[][]={{10+5,15+5,5,6,7,}, {16,17},{ 14,18}};
		for (int i = 0; i < abc.length; i++) {
			for (int j = 0; j < abc[i].length; j++) 
				System.out.print(abc[i][j]+" ");
			
				System.out.println();
			}
			//System.out.println();
			
	}

}
