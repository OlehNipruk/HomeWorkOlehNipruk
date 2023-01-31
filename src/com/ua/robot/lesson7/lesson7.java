package com.ua.robot.lesson7;

public class lesson7 {
    public static void main(String[] args) {
        System.out.println(cube(3));
        printStarNumberTimes(9);
        System.out.println();
        printSymbolNumberTimes("<>", 5);
    }

    static int cube(int a) {
        return a * a * a;
    }

    static void printStarNumberTimes(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    static void printSymbolNumberTimes(String symbol, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }
}






