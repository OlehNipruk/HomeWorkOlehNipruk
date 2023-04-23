package com.ua.robot.lesson26;

public class Main {
    public static void main(String[] args) {
        try {
            int number = -5;
            int result = square(number);
            System.out.println("Squared number" + number + " is equal to " + result);
        } catch (NegativeNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static int square(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("A negative number is entered");
        }
        return number * number;
    }
}
