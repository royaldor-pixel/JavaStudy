package com.battle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {
        int guessNum = 0;
        boolean isAlive = true;
        int randNum = (int) (5 * Math.random());

        Scanner sc = new Scanner(System.in);
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        ArrayList<String> locations = new ArrayList<>(
            Arrays.asList(Integer.toString(randNum), Integer.toString(randNum + 1),
                Integer.toString(randNum + 2)));

        simpleDotCom.setLocationCells(locations);

        while (isAlive) {
            System.out.print("enter a number(0-7): ");
            String guess = sc.nextLine();
            guessNum = guessNum + 1;
            String result = simpleDotCom.checkYourself(guess);
            if (result.equals("kill")) {
                isAlive = false;
            }
        }

        System.out.println("You took " + guessNum + " guesses");
    }


}
