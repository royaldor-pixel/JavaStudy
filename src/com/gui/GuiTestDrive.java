package com.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class GuiTestDrive {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click Me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
