package com.ua.robot.lesson6;
public class Lesson6 {
    public static void main(String[] args) {
        //Task 6.1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        //Task 6.2
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //Task 6.3
        int result = 1;
        for (int i = 1; i <= 7; i++) {
            result *= i;
        }
        System.out.println();
        System.out.println("7!=" + result);

        //Task 6.4
        System.out.print("0 1 ");
        int n1 = 1;
        int n2 = 1;
        do {
            System.out.print(n2 + " ");
            int thirdHelp = n2;
            n2 = n2 + n1;
            n1 = thirdHelp;
        } while (n2 <= 100);
    }
}