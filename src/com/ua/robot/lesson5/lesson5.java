package com.ua.robot.lesson5;
import java.util.Scanner;
public class lesson5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input A");
        int A = input.nextInt();
        System.out.println("Input B");
        int B = input.nextInt();

        // Task 1
        if ((A > B) && (A != B)) {
            System.out.println("A is bigger number");
        } else if ((A < B) && (A != B)) {
            System.out.println("B is bigger number");
        }

        // Task 2
        if ((A < B) && (A != B)) {
            System.out.println("A is smaller number");
        } else if ((A > B) && (A != B)) {
            System.out.println("B is smaller number");
        }

        // Task 3
        if (A % 2 == 0) {
            System.out.println("A is even number");
        } else {
            System.out.println("A is odd number");
        }
        if (B % 2 == 0) {
            System.out.println("B is even number");
        } else {
            System.out.println("B is odd number");
        }
    }
}