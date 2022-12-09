package com.javabasic.JOptionPane;

import javax.swing.*;

public class JOptionPaneUtil {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are "+age+" years old");
    }
}
