package mod_08.mediumLevel;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number " + number + " is even");
        } else {
            System.out.println("This number " + number + " is own");
        }

        scanner.close();
    }
}
