package com.autoboxing;

import java.util.Calendar;

public class TestBox {

    static Integer i;
    static float j;

    public static void main(String[] args) {
        j = 10_000_000;
        System.out.printf("%,10.2f", (float) j);
    }

    public void go() {
        j = 1;
        System.out.println(j);
        System.out.println(i);
        Calendar cal = Calendar.getInstance();
    }
}
