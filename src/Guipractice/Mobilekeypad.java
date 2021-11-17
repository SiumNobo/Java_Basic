package Guipractice;

import javax.swing.*;
import java.awt.*;

public class Mobilekeypad {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lab=new JLabel("Select One");
        frame.add(lab);
        lab.setBackground(Color.green);
     frame.setLayout(new GridLayout(9,3));
     Button b1=new Button("1.Bachete chai");
     Button b2=new Button("2.Bachete chai nah");
     frame.add(b1);
     frame.add(b2);
frame.setVisible(true);
    }
}