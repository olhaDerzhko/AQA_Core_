package mod_08.mediumLevel;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score (0-100): ");
        int score = scanner.nextInt();
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 0 && score < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid score entered. Please enter a score between 0 and 100");
            scanner.close();
            return;
        }

        System.out.println("The gradle for a score of " + score + " is " + grade + ".");
        scanner.close();
    }
}
