package com.ua.robot.lesson34;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return (int)(Math.random() * 50) + 1;
            }
        };
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executor.submit(callable);
            System.out.println("Thread " + (i+1) + " returned: " + future.get());
        }
        executor.shutdown();
    }
}

