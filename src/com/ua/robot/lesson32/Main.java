package com.ua.robot.lesson32;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintNumbersTask("Thread 1"));
        Thread thread2 = new Thread(new PrintNumbersTask("Thread 2"));
        thread1.start();
        thread2.start();
    }
    private static class PrintNumbersTask implements Runnable {
        private final String threadName;
        public PrintNumbersTask(String threadName) {
            this.threadName = threadName;
        }
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " - " + i);
            }
        }
    }

}
