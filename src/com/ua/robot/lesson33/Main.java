package com.ua.robot.lesson33;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            Random rand = new Random();
            while (true) {
                int num = rand.nextInt(10) + 1;
                System.out.println(num);
                if (num == 5) {
                    break;
                }
            }
        });
        t.start();
    }
    }
