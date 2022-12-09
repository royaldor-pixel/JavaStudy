package com.exception;

public class MyEx extends Exception{
    static void doRisky(String t) throws MyEx{
        System.out.print("h");
        if ("yes".equals(t)){
            throw new MyEx();
        }
    }
}
