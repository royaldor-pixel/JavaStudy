package com.javabasic.page21;

public class Test {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {

            if (y < 5) {
                x++;
                if (y < 3) {
                    x--;

                }
            }
            y += 2;

            System.out.print(x + "" + y + " ");
            x++;
        }
    }

}
