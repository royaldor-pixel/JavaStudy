package com.javabasic.methods;

public class method {
    public static void main(String[] args) {
        hello();
        System.out.println(add(1,2));
    }

    static void hello() {
        System.out.println("Hello " + "bro");
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }
}
