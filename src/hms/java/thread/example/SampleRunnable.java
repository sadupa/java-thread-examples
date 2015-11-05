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
 * Created on : 11/5/15 3:43 PM
 */
public class SampleRunnable implements Runnable {
    long timeToSleep;

    public SampleRunnable() {

    }

    public SampleRunnable(long timeToSleep) {
        this.timeToSleep = timeToSleep;
    }

    @Override
    public void run() {
        try {
            if (timeToSleep > 0) {
                Thread.sleep(timeToSleep);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
