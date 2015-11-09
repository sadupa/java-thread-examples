package hms.java.thread.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
 * Created on : 11/5/15 10:53 PM
 */
public class ExecutorServiceDemo {

    private static class SampleRunnable implements Runnable {
        @Override
        public void run() {
            threadMessage("Running thread");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Runnable r1 = new SampleRunnable();
        Runnable r2 = new SampleRunnable();
        Runnable r3 = new SampleRunnable();
        Runnable r4 = new SampleRunnable();
        Runnable r5 = new SampleRunnable();
        Runnable r6 = new SampleRunnable();
        Runnable r7 = new SampleRunnable();
        Runnable r8 = new SampleRunnable();
        Runnable r9 = new SampleRunnable();
        Runnable r10 = new SampleRunnable();

        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);
        executorService.execute(r4);
        executorService.execute(r5);
        executorService.execute(r6);
        executorService.execute(r7);
        executorService.execute(r8);
        executorService.execute(r9);
        executorService.execute(r10);

        executorService.shutdown();

    }

    // Display a message, preceded by
    // the name of the current thread
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("[%s]: %s%n", threadName, message);
    }
}
