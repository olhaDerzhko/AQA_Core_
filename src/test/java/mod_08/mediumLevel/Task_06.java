package mod_08.mediumLevel;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        int ageGroup = (age < 0) ? -1 : (age <= 12) ? 1 : (age <= 19) ? 2 : (age <= 59) ? 3 : 4;
        String category = switch (ageGroup) {
            case 1 -> "Child";
            case 2 -> "Teenager";
            case 3 -> "Adult";
            case 4 -> "Senior";
            default -> "Invalid age entered. Age cannot be negative";
        };
        System.out.println(category);
        scanner.close();
    }
}
