package com.javabasic.condition;

import java.util.Scanner;

public class HelloWorld {

    static{
        System.out.println("super static block");
    }

    public static void main(String[] args) {
        Double result = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("please input number 1:\t");
        double num1 = sc.nextDouble();
        System.out.println("please input number 2:\t");
        double num2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("What operation do you want to perform?");
        String operand = sc.nextLine();
        switch (operand) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0) System.out.println("Can not divide by zero");
                else result = num1 / num2;
            }
            default -> System.out.println("invalid operation");
        }
        if (result!=null){
            System.out.println(result);
        }
    }
}
