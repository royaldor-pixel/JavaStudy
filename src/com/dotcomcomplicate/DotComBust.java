package com.dotcomcomplicate;

import java.util.ArrayList;

public class DotComBust {

    private final GameHelper gameHelper;
    private final ArrayList<DotCom> dotComs = new ArrayList<>();
    private int numberOfGuess = 0;

    private static final String miss = "miss";
    private static final String hit = "hit";


    public DotComBust() {
        DotCom dotCom1 = new DotCom();
        DotCom dotCom2 = new DotCom();
        DotCom dotCom3 = new DotCom();
        gameHelper = new GameHelper();
        dotCom1.setName("Baidu");
        dotCom2.setName("Alibaba");
        dotCom3.setName("Tencent");
        dotComs.add(dotCom1);
        dotComs.add(dotCom2);
        dotComs.add(dotCom3);

    }

    public void setUpGame() {
        System.out.println("Your goal is to sink all three dot coms.");
        System.out.println("Baidu.com, Alibaba.com, Tencent.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        for (DotCom dotComToSet : dotComs) {
            ArrayList<String> newLocation = gameHelper.placeDotCom(3);
            dotComToSet.setLocationCell(newLocation);
        }
    }

    public void startGame() {
        while (!dotComs.isEmpty()) {
            String userGuess = gameHelper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numberOfGuess++;
        String result = miss;
        for (DotCom dotComToTest : dotComs) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals(hit)) {
                break;
            }
            if (!dotComToTest.isAlive()) {
                dotComs.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numberOfGuess <= 18) {
            System.out.println("It only took you " + numberOfGuess + " guesses.");
            System.out.println(" You got out before your options sank.");
        }
        else {
            System.out.println("Took you long enough. " + numberOfGuess + " guesses");
            System.out.println("Fish are dancing with your options");
        }
    }


}