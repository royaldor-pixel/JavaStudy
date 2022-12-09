package com.javabasic.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;


public class calculate {

    static final byte MONTH_IN_YEAR = 12;
    static final byte PERCENT = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int principle = inputPrinciple(sc);
        int period = inputPeriod(sc);
        float interest = inputInterest(sc);
        calculateMortgage(principle, period, interest);


    }

    static int inputPrinciple(Scanner scanner) {
        int principle;
        while (true) {
            System.out.println("Please input the principle:");
            principle = scanner.nextInt();
            if (principle >= 0) {
                break;
            }
            System.out.println("please input a number greater than 0");
        }
        return principle;
    }

    static int inputPeriod(Scanner scanner) {
        int period;
        while (true) {
            System.out.println("Please input the period(year):");
            period = scanner.nextByte();
            if (period >= 0 && period <= 30) {
                break;
            }
            System.out.println("please input a number between 0 and 30");
        }
        return period;
    }

    static float inputInterest(Scanner scanner) {
        float interest;
        while (true) {
            System.out.println("please input the interest(percentage):");
            interest = scanner.nextFloat();
            if (interest < 0) {
                System.out.println("please input a positive number");
            }
            else if (interest > 10) {
                System.out.println("the interest is too high");
            }
            else {
                break;
            }
        }
        return interest;
    }

    static void calculateMortgage(int principle, int period, float interest) {
        period = period * MONTH_IN_YEAR;
        interest = interest / PERCENT / MONTH_IN_YEAR;
        double mortgage = (principle * interest * Math.pow((1 + interest), period)) / (
            Math.pow((1 + interest), period) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        String mortgageFormattedTotal = NumberFormat.getCurrencyInstance()
            .format((mortgage * period));
        System.out.println(
            "The amount of money you need to pay monthly is:\n " + mortgageFormatted);
        System.out.println(
            "\nThe total amount of money you need to pay is \n" + mortgageFormattedTotal);
    }
}
