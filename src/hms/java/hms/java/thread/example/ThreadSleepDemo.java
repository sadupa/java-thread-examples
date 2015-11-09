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
 * Created on : 11/5/15 12:28 PM
 */
public class ThreadSleepDemo {
    public static void main(String args[])
            throws InterruptedException {


            System.out.println("["+new Date() + "] " + "Thread gonna sleep");
            //Pause for 4 seconds
            Thread.sleep(3000);
            //Print a message
            System.out.println("["+new Date() + "] " + "Thread wakeup");

    }
}
