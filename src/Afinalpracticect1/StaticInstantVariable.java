package Afinalpracticect1;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class StaticInstantVariable {
    public static void main(String[] args){
        JFrame frame =  new JFrame("My App");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setBackground(Color.YELLOW);
        JLabel labels =  new JLabel("Are you sure you want to exist?");
        JButton button1 = new JButton("Exit");
        JButton button2 = new JButton("Close");
        p .add(labels);
        p .add(button1);
        p .add(button2);
        frame.add(p);
        frame.setVisible(true);
    }
}

