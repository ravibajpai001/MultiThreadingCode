package com.javaMuliThreadingCodes.leetcode;

public class LeetcodeConditionVariableJava {

/*
class Foo {

        ReentrantLock lock= new ReentrantLock();
        Condition condition = lock.newCondition();
        int whoIsWorking = 1;
        public Foo() {

        }

        public void  first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            lock.lock();
            while(whoIsWorking != 1){
                condition.await();
            }

            printFirst.run();
            whoIsWorking=2;
            condition.signalAll();
            lock.unlock();
        }

        public void second(Runnable printSecond) throws InterruptedException {

            // printSecond.run() outputs "second". Do not change or remove this line.
            lock.lock();
            while(whoIsWorking != 2){
                condition.await();
            }
            printSecond.run();
            whoIsWorking=3;
            condition.signalAll();
            lock.unlock();
        }

        public  void   third(Runnable printThird) throws InterruptedException {

            // printThird.run() outputs "third". Do not change or remove this line.
            lock.lock();
            while(whoIsWorking != 3){
                condition.await();
            }
            printThird.run();
            whoIsWorking=4;
            condition.signalAll();
            lock.unlock();
        }
    }
    */


}
