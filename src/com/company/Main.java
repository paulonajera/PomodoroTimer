package com.company;
import java.util.*;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {

        Message msg = new Message();
        int rounds = msg.greeting();

        JOptionPane.showMessageDialog(null, "The number of rounds you selected was: " + rounds);

        PomoTimer tm = new PomoTimer();
        tm.time(rounds);


    }
}
