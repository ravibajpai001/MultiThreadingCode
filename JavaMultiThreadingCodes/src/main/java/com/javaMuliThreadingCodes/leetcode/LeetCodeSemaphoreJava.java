package com.javaMuliThreadingCodes.leetcode;

public class LeetCodeSemaphoreJava {
/*    class ZeroEvenOdd {
        private int n;
        int totalCount=0;
        int currentNumber = 1;
        Semaphore semZero = new Semaphore(1);
        Semaphore semEven = new Semaphore(0);
        Semaphore semOdd = new Semaphore(0);

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            while(true){
                semZero.acquire();
                if(totalCount>=2*n)
                {
                    semEven.release();
                    semOdd.release();
                    return;
                }
                // System.out.println(" printing 0 ");
                printNumber.accept(0);
                totalCount++;
                if(currentNumber%2 ==0)
                    semEven.release();
                else
                    semOdd.release();

            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            while(true){
                semEven.acquire();
                if(totalCount>=2*n)
                {
                    semZero.release();
                    return;
                }
                //System.out.println(" printingX "+ currentNumber);
                printNumber.accept(currentNumber);
                currentNumber++;
                totalCount++;
                semZero.release();
            }

        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            while(true){
                semOdd.acquire();
                if(totalCount>=2*n)
                {
                    semZero.release();
                    return;
                }
                //System.out.println(" printingY "+ currentNumber);
                printNumber.accept(currentNumber);
                currentNumber++;
                totalCount++;
                semZero.release();
            }
        }
    }*/
}
