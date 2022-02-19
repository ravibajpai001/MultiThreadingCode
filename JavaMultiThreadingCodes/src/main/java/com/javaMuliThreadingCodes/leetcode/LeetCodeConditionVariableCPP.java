package com.javaMuliThreadingCodes.leetcode;

public class LeetCodeConditionVariableCPP {

    /*using namespace std;
    class Foo {

        std::mutex mtx;
        std::condition_variable cv;
        int whoIsWorking =1;
        public:
        Foo() {

        }

        void first(function<void()> printFirst) {

            // printFirst() outputs "first". Do not change or remove this line.
            std::unique_lock<std::mutex> lck(mtx);
            //unique_lock will call unlock whenver it goes out of scope
            while(whoIsWorking !=1) {cv.wait(lck);}

            printFirst();
            whoIsWorking=2;
            cv.notify_all();

        }

        void second(function<void()> printSecond) {

            // printSecond() outputs "second". Do not change or remove this line.
            std::unique_lock<std::mutex> lck(mtx);
            //unique_lock will call unlock whenver it goes out of scope
            while(whoIsWorking !=2) {cv.wait(lck);}
            printSecond();
            whoIsWorking=3;
            cv.notify_all();
        }

        void third(function<void()> printThird) {

            // printThird() outputs "third". Do not change or remove this line.
            std::unique_lock<std::mutex> lck(mtx);
            //unique_lock will call unlock whenver it goes out of scope
            while(whoIsWorking !=3) {cv.wait(lck);}
            printThird();
            whoIsWorking=4;
            cv.notify_all();
        }
    };*/
}
