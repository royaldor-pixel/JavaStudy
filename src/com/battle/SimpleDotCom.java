package com.battle;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotCom {

    private ArrayList<String> locationCells;
    Scanner sc = new Scanner(System.in);

    String checkYourself(String userInput) {

        int index = locationCells.indexOf(userInput);
        String result = "miss";
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            }
            else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }

    void setLocationCells(ArrayList<String> loc) {
        if (loc != null) {
            locationCells = loc;
        }
    }

}
