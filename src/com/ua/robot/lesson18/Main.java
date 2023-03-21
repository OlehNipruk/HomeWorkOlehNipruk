package com.ua.robot.lesson18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 2000000; i++) {
            list2.add(i);
        }
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Ivan", "Petrenko"));
        studentList.add(new Student(2, "Boris", "Johnson"));
        studentList.add(new Student(3, "Joe", "Biden"));
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}
