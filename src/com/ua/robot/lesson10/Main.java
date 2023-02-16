package com.ua.robot.lesson10;

public class Main {
    public static void main(String[] args) {
        Arr arr = new Arr();
        int[] array = arr.createArr(10);
        arr.printArr(array);
        arr.increasingSortArray(array);
        arr.printArr(array);
        arr.decreasingSortArray(array);
        arr.printArr(array);
    }
}
