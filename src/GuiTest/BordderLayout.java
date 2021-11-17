package GuiTest;

import javax.swing.*;
import java.awt.*;

public class BordderLayout {

    public static void main(String[]args)
    {
        JFrame frame=new JFrame("App");
        frame.setSize(1500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Button bu1= new Button("Button 1");
        Button bu2=new Button("Button 2");
        Button bu3=new Button("Button 3");
        Button bu4=new Button("Button 4");
        Button bu5=new Button("Button 5");
        Button bu6=new Button("Button 6");

        frame.add(bu1, BorderLayout.CENTER);
        frame.add(bu2,BorderLayout.WEST);
        frame.add(bu3,BorderLayout.EAST);
        frame.add(bu4,BorderLayout.NORTH);
        frame.add(bu5,BorderLayout.SOUTH);
        frame.add(bu6,BorderLayout.CENTER);
        frame.setVisible(true);

    }
}
