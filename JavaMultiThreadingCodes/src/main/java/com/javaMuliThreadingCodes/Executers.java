package com.javaMuliThreadingCodes;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Executers {

    public static void main(String[] args) {
       Executor executor = Executors.newSingleThreadExecutor();
        //ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" Doing print job");
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+ " Doing reading job");
            }
        };

        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" Doing writing job");
            }
        };

        for(int i=0;i<30;i++)
        {
            executor.execute(task1);
            //Executes the given command at some time in the future.
            // The command may execute in a new thread, in a pooled thread, or in the calling thread,
            // at the discretion of the Executor implementation.
            executor.execute(task2);
            executor.execute(task3);
            executor.execute(task1);
        }

        System.out.println("All threading is completed ");
    }
}
