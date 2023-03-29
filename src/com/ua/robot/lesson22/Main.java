package com.ua.robot.lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Petrenko", 87));
        students.add(new Student("Ivanenko", 99));
        students.add(new Student("Sydorenko", 78));
        System.out.println(students);
        Collections.sort(students, (o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
        System.out.println(students);
        Collections.sort(students, (o1, o2) -> Integer.compare(o1.getAvarageScore(), o2.getAvarageScore()));
        System.out.println(students);
    }
}
