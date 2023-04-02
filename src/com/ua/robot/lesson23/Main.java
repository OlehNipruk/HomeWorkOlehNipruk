package com.ua.robot.lesson23;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Task1
        List<String> surnames = Arrays.asList("Ivanenko", "Petrenko", "Sidorenko", "Johnson", "Biden", "Sunak", "Petrenko",
                "Shevchenko", "Stepanenko", "Biden", "Sunak", "Shevchenko", "Fedoriv", "Stepanenko",
                "Ivanenko", "Petrenko", "Sidorenko", "Fedoriv", "Kravets", "Shevchenko");
        Map<String, Long> map = surnames.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        map.forEach((key, value) -> System.out.println(key + ": " + value));
        //Task2
        List<Integer> numbers = new Random().ints(10, 1, 100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numbers);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);
    }
}
