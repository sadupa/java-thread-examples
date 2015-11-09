package hms.java.thread.example;

import java.util.Date;

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
 * Created on : 11/5/15 3:42 PM
 */
public class MultiThreadDemo {

    private static class SampleThread implements Runnable {
        long timeToSleep;

        public SampleThread() {

        }

        public SampleThread(long timeToSleep) {
            this.timeToSleep = timeToSleep;
        }

        @Override
        public void run() {
            threadMessage("Starting to run");
            try {
                if (timeToSleep > 0) {
                    threadMessage("Sleeping " + timeToSleep + " seconds");
                    Thread.sleep(timeToSleep);
                    threadMessage("Wakeup");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                threadMessage("Execution done");
            }
        }
    }


    // Display a message, preceded by
    // the name of the current thread
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s [%s]: %s%n", new Date(), threadName, message);
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new SampleThread(3000), "Thread-1");
        Thread t2 = new Thread(new SampleThread(), "Thread-2");

        threadMessage("Starting to run threads");
        t1.start();
        t2.start();
    }
}
