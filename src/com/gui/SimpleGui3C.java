package com.gui;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class SimpleGui3C {

    JFrame frame;
    MyDrawPanel myDrawPanel;
    JButton labelButton;
    JButton colorButton;
    JLabel label;


    public SimpleGui3C() {
        frame = new JFrame();
        myDrawPanel = new MyDrawPanel();
        colorButton = new JButton("Change Colors");
        labelButton = new JButton("Change Label");
        label = new JLabel("I'm a label");

    }

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        colorButton.addActionListener(new ColorListener());
        labelButton.addActionListener(new LabelListener());

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {

        boolean isChanged = false;

        @Override
        public void actionPerformed(ActionEvent e) {
            isChanged = !isChanged;
            label.setText(isChanged ? "Label Changed" : "Change Label");
        }
    }

    class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            myDrawPanel.generateRandColor();
            frame.repaint();
        }
    }
}
