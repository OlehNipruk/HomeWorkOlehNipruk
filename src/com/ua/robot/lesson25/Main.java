package com.ua.robot.lesson25;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int number = 0;

        while (!validInput) {
            try {
                System.out.print("Enter a number: ");
                number = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: The entered value is not a number.");
            }
        }

        System.out.println("You entered a number: " + number);
    }
}
