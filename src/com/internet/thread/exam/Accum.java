package com.internet.thread.exam;

public class Accum {
    private Accum() {
    }

    private static Accum a = new Accum();
    private int counter = 0;

    public static Accum getAccum() {
        return a;
    }

    public int getCount() {
        return counter;
    }

    public void updateCounter(int add) {
        counter += add;
    }
}
