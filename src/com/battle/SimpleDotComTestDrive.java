package com.battle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        ArrayList<String> locations = new ArrayList<>(Arrays.asList("2","3","4"));

        dot.setLocationCells(locations);

        String guess = "2";
        String result = dot.checkYourself(guess);
        String testResult = "Failed";

        if (result.equals("hit")) {
            testResult = "Success";
        }

        System.out.println(testResult);

        testResult = "Failed";
        dot.checkYourself("2");
        String killResult = dot.checkYourself("2");
        if (killResult.equals("kill")) {
            testResult = "Success";
        }

        System.out.println(testResult);
    }
}
