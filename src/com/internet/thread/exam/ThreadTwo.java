package com.internet.thread.exam;

public class ThreadTwo implements Runnable {

    Accum a = Accum.getAccum();

    @Override
    public synchronized void run() {
        for (int x = 0; x < 99; x++) {
            a.updateCounter(1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("two " + a.getCount());
        }
    }
}
