package BankLoan;

import java.util.Scanner;

public class LoanMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Annual Interest Rate, Example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Inter Number Of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter Loan Amount, Example, 120000.95 ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The Loan Was Created On >*>*>> %s\n\n" +
                        "The Monthly payment is %.2f\n\nThe Total Payment is %.2f\n",
                loan.getloanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());

        input.close();

    }

}
