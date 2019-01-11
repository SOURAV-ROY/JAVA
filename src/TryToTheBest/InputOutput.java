package TryToTheBest;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = input.nextInt();
        if (n%2 == 0){
            if(n<10)
                System.out.println("The Number Less Than = 10 > "+n);
            else
                System.out.println("The Number Greater Than = 10 < "+n);
            System.out.println("Even");

        }
        else {
            if(n<10)
                System.out.println("The Number Less Than 10 >"+n);
            else
                System.out.println("The Greater Than 10 <"+n);
            System.out.println("ODD");
        }
    }
}
