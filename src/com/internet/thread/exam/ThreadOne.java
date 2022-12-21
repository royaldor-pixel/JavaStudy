package com.internet.thread.exam;

public class ThreadOne implements Runnable {

    Accum a = Accum.getAccum();

    @Override
    public synchronized void run() {
        for (int x = 0; x < 98; x++) {
            a.updateCounter(1000);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("one " + a.getCount());
        }
    }
}
