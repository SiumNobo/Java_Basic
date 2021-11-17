package GuiTest;

import javax.swing.*;
import java.awt.*;

public class Guitest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Applite");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lab=new JLabel("What you want to do?");
        //if we want to change it,we need to use set text method. label.setText
        TextField jtext=new TextField(15);

        Panel bigpan=new Panel();
        Panel toppan=new Panel();
        Panel bottom=new Panel();


        toppan.add(lab);
        toppan.add(jtext);
        Button b1=new Button("Button1");
        Button b2=new Button("Button 2");
        Button b3=new Button("Button 3");

        bottom.add(b1);
        bottom.add(b2);
        bottom.add(b3);

        bigpan.add(toppan);
        bigpan.add(bottom);
        frame.add(bigpan);
        frame.setVisible(true);


    }
}
//jframe,jlebel,jbutton,jtextfeild,jtextarea
