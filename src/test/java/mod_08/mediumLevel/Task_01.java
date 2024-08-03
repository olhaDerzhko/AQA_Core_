package mod_08.mediumLevel;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the product excluding VAT: ");
        double priceExcludingVAT = scanner.nextDouble();

        double vat = priceExcludingVAT * 0.20;
        double priceIncludingVAT = priceExcludingVAT + vat;

        System.out.printf("Price excluding VAT: %.2f%n", priceExcludingVAT);
        System.out.printf("Price including VAT: %.2f%n", priceIncludingVAT);

        scanner.close();
    }
}
