package com.dotcomcomplicate;

import java.util.ArrayList;

public class DotCom {

    private String name = "default_name";
    private ArrayList<String> locationCells;

    private boolean isAlive = true;
    private static final String hit = "hit";
    private static final String miss = "miss";
    private static final String kill = "kill";

    String checkYourself(String userInput) {
        String status;
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                status = kill;
                isAlive = false;
            }
            else {
                status = hit;
            }

        }
        else {
            status = miss;
        }
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCell(ArrayList<String> loc) {
        if (!loc.isEmpty()) {
            this.locationCells = loc;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }
}
