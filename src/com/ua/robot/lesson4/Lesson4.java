package com.ua.robot.lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println("upperCase:" + str.toUpperCase());
        System.out.println("lowerCase:" + str.toLowerCase());
        System.out.println("first Letter:" + str.charAt(0));
        System.out.println("last Letter:" + str.charAt(str.length() - 1));
    }
}
