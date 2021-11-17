package GuiTest;

import javax.swing.*;
import java.awt.*;

public class FlowLayouttt {
    public static void main(String[]args)
    {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));//if we don't give any alignment,component will be in center
        frame.setSize(120,200);

        Button but1=new Button("Button 1");
        Button but2=new Button("Button 2");
        Button but3=new Button("Button 3");
        frame.add(but1);
        frame.add(but2);
        frame.add(but3);
        frame.setVisible(true);


    }
}
