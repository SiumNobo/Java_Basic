package Guipractice;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

public class Guiflowlayout {
    public static void main(String []args)
    {
        JFrame frame=new JFrame();
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());
        JButton j1=new JButton("But 1");
        JButton j2=new JButton("But 2");
        JButton j3=new JButton("But 3");
        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.setVisible(true);

    }

}
