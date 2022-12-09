package com.internet.thread;

public class SingletonTestDrive {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
    }

}
