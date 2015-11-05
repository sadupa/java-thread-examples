package hms.java.thread.example;

/**
 * (C) Copyright 2015 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 * <p/>
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 * <p/>
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 *
 * @Author Sadupa Wijeratne
 * Created on : 11/5/15 9:56 PM
 */
public class NonSynchronizedDemo {

    private static class NumberPrinter {
        public void printNumbers() {
            for (int i = 1; i < 6; i++) {
                threadMessage(String.valueOf(i));
            }
        }
    }

    private static class SampleThread implements Runnable {
        NumberPrinter numberPrinter;

        public SampleThread(NumberPrinter numberPrinter) {
            this.numberPrinter = numberPrinter;
        }

        @Override
        public void run() {
            numberPrinter.printNumbers();
        }
    }

    public static void main(String[] args) {

        NumberPrinter numberPrinter = new NumberPrinter();

        Thread t1 = new Thread(new SampleThread(numberPrinter));
        Thread t2 = new Thread(new SampleThread(numberPrinter));
        Thread t3 = new Thread(new SampleThread(numberPrinter));
        Thread t4 = new Thread(new SampleThread(numberPrinter));
        Thread t5 = new Thread(new SampleThread(numberPrinter));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Display a message, preceded by
    // the name of the current thread
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("[%s]: %s%n",threadName, message);
    }
}
