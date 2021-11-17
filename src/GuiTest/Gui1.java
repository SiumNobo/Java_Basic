package GuiTest;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class Gui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Apps Style");
        JLabel j=new JLabel("What do you want");
        frame.setSize(200,400);
        Button but=new Button("Name");
        but.setBackground(Color.YELLOW);
        Button but2=new Button("ID");
        but2.setBackground(Color.green);
        Button but3=new Button("Your Problem");
        but3.setBackground(Color.CYAN);
        Panel pan=new Panel();
        pan.add(j);
        pan.add(but);
        pan.add(but2);
        pan.add(but3);
        pan.setBackground(Color.green);
        frame.add(pan);
        frame.setVisible(true);
    }
}