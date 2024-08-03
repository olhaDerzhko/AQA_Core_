package mod_08.mediumLevel;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temperature, sum = 0.0f;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter the temperature for day " + i + " : ");
            temperature = scanner.nextFloat();
            sum += temperature;
        }

        float averageTemperature = sum / 5;
        System.out.printf("The average temperature over five days is: %.2f%n", averageTemperature);

        scanner.close();
    }
}
