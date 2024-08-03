package mod_08.mediumLevel;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something about you!");
        String inputString = scanner.nextLine();

        int vowelCount = 0;
        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Total number of vowels: " + vowelCount);

        scanner.close();
    }
}
