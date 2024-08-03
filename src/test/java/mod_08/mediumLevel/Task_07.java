package mod_08.mediumLevel;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percent): ");
        double annualInterestRate = scanner.nextDouble();

        double rate = annualInterestRate / 100;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double amount = principal;
        for (int i = 1; i <= years; i++) {
            amount = amount * (1 + rate);
            System.out.printf("After %d years: %.2f%n", i, amount);
        }

        scanner.close();
    }
}
