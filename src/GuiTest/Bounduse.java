package GuiTest;

import javax.swing.*;
import java.awt.*;

public class Bounduse {
    public static void main(String[]args)
    {
        JFrame frame=new JFrame();
        frame.setSize(250,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Button b1=new Button("Button 1");
        Button b2=new Button("Button 2");
        Button b3=new Button("Button 3");

        b1.setBounds(20,10,50,50);
        b2.setBounds(150,100,50,50);
        b3.setBounds(200,200,50,50);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setVisible(true);

        //If we increase value of x, it will go on the right side. Decrease- Left
        //If we decrease value of y,it will go on the up. Decrease-Down! Down! Down!
        // If I increase third parameter value,It will increase the width of this Button.
        // If I increase fourth parameter value,It will increase the height of the Button.
        //Border Lay default of JFrame.
        //Flow Lay default of JLabel.
    }
}
