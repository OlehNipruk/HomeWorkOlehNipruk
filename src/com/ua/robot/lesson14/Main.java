package com.ua.robot.lesson14;

public class Main {
    public static void main(String[] args) {
        Person teacher = new Teacher();
        Person student = new Student();
        teacher.perform();
        student.perform();
    }
}
