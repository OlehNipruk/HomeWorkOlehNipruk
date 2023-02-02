package com.ua.robot.lesson8;

import java.util.Random;

public class lesson8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        printArray(arr);
        System.out.println("Min value in array: " + getMinValueInArray(arr));
        System.out.println("Max value in array: " + getMaxValueInArray(arr));
        System.out.println("Avarage of elements: " + getAvarageOfElements(arr));
        System.out.println("Sum of elements: " + getSumOfElements(arr));
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int getMaxValueInArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int getMinValueInArray(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    static int getSumOfElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static double getAvarageOfElements(int[] arr) {
        return (double) getSumOfElements(arr) / (double) arr.length;
    }
}
