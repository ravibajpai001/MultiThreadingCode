package com.javaMuliThreadingCodes;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Doing print job");
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Doing reading job");
            }
        };

        for (int i = 0; i < 10; i++) {
            executorService.submit(task1);
            executorService.submit(task2);
            executorService.submit(new RandomNumberTask());
        }

    }

    public static class RandomNumberTask implements Callable {

        //In callable we can have return value and it can throw  exceptions
        // in runnable we can't do that
        public Object call() throws Exception {
            // Create random number generator
            Random generator = new Random();

            Integer randomNumber = generator.nextInt(5);
            System.out.println(Thread.currentThread().getName() + " generating random number "+ randomNumber);
            // To simulate a heavy computation,
            // we delay the thread for some random time
            Thread.sleep(randomNumber * 1000);
            return randomNumber;
        }
    }

}
