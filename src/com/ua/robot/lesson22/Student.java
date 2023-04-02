package com.ua.robot.lesson22;

public class Student {
    private String surname;
    private int avarageScore;
    public Student(String surname, int avarageScore) {
        this.surname = surname;
        this.avarageScore = avarageScore;
    }

    public String getSurname() {
        return surname;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surName='" + surname + '\'' +
                ", avarageScore=" + avarageScore +
                '}';
    }
}
