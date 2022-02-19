package com.javaMuliThreadingCodes;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

public class AsyncWithFutureTask {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ArrayList<FutureTask> task = new ArrayList<FutureTask>();
        //FutureTask<RandomNumberTask> tasks = new FutureTask<RandomNumberTask>();
        for (int i = 0; i < 5; i++) {
            FutureTask task1= (FutureTask) executorService.submit(new ExecutorServiceExample.RandomNumberTask());
            task.add(task1);
        }

        while(true) {
            boolean allDone = true;
            for (FutureTask future : task) {
                allDone &= future.isDone(); // check if future is done
            }
            if(allDone){
                System.out.println("all task done");
                break;
            }else{
                System.out.println("waiting for sometime, will check again ");
                Thread.sleep(500);
            }
        }
        for(FutureTask t : task) {
            System.out.println(" Result of task is "+t.get());
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
