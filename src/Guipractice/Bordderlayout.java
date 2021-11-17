package Guipractice;

import javax.swing.*;
import java.awt.*;

public class Bordderlayout {
    public static void main(String[]args)
    {
        JFrame frame=new JFrame("Apps Style");
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label=new JLabel("Select one");
        frame.add(label);
        Button but1=new Button("Button 1");
        Button but2=new Button("Button 2");
        Button but3=new Button("Button 3");



        frame.add(but1,BorderLayout.CENTER);
        frame.add(but2,BorderLayout.SOUTH);
        frame.add(but3,BorderLayout.NORTH);
        frame.setVisible(true);

    }
}
