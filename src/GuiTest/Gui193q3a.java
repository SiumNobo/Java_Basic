package GuiTest;

import javax.swing.*;
import java.awt.*;

public class Gui193q3a {
    public static void main(String[]args)
    {
        JFrame frame=new JFrame("App title");
        frame.setSize(200,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Button bu1=new Button("Content");
        frame.add(bu1,BorderLayout.CENTER);
        Button bu2=new Button("Links");
        frame.add(bu2,BorderLayout.WEST);
        Button bu3=new Button("adds");
        frame.add(bu3,BorderLayout.EAST);
        Button bu4=new Button("footer");
        frame.add(bu4,BorderLayout.SOUTH);
        Button bu5=new Button("Header");
        frame.add(bu5,BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
