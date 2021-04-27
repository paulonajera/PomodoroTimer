package com.company;
import javax.swing.*;


public class Message {
    public int greeting() {
        int rounds = 0;

        JOptionPane.showMessageDialog(null, "Hello and welcome to Pomodoro Timer!");
        var rounds1 = rounds;
        rounds1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of rounds you would like to complete: "));

        return rounds1;
    }
}
