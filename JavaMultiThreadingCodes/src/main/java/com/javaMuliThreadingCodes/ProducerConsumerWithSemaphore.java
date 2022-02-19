package com.javaMuliThreadingCodes;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class ProducerConsumerWithSemaphore {

    Semaphore consumer = new Semaphore(0);
    Semaphore producer = new Semaphore(1);

    int count;

    public static void main(String[] args) {


        ProducerConsumerWithSemaphore data = new ProducerConsumerWithSemaphore();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        data.producer.acquire();
                        data.count++;
                        System.out.println("I am producing total elements are " + data.count);
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        data.consumer.release();
                    }
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {

                    try {
                        data.consumer.acquire();
                        // Double num = Math.random();
                        data.count--;
                        System.out.println("consuming " + data.count);
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        data.producer.release();
                    }
                }
            }
        });

        producer.start();
        consumer.start();

        //Thread.
    }
}
