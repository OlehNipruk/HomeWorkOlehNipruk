package com.ua.robot.lesson17;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDayOfWeekByNumber(1));
        System.out.println(getDayOfWeekByNumber(7));
    }

    static String getDayOfWeekByNumber(int number) {
        String result = "";
        for (DayOfWeek value : DayOfWeek.values()) {
            if (value.ordinal() == (number - 1)) {
                result = value.name();
                break;
            }
        }
        return result;
    }
}
