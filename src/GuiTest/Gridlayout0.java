package GuiTest;

import javax.swing.*;
import java.awt.*;

public class Gridlayout0 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AppStyle");
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3));

        Button bu = new Button("Button 1");
        Button bu1 = new Button("Button 2");
        Button bu2 = new Button("Button3");
        Button bu3 = new Button("Button 4");
        Button bu4 = new Button("Button 5");
        Button bu5 = new Button("Button 6");
        Button bu6 = new Button("Button 7");
        Button bu7 = new Button("Button 8");
        Button bu8 = new Button("Button 9");

        frame.add(bu);
        frame.add(bu1);
        frame.add(bu2);
        frame.add(bu3);
        frame.add(bu4);
        frame.add(bu5);
        frame.add(bu6);
        frame.add(bu7);
        frame.add(bu8);

//it does not change row number,it only changes collum number;if we add more than set size!
        frame.setVisible(true);
    }
}


