package PreparationForFinalExam;

import javax.swing.*;
import java.awt.*;

public class Guipannel {
    public static void main(String[]args)
    {
        JFrame j=new JFrame("");
        j.setSize(200,400);
        JPanel c=new JPanel();
        c.setBackground(Color.black);
        JButton k=new JButton("KIno");
        c.add(k);
        j.add(c);
        k.setBackground(Color.BLUE);
        j.setVisible(true);
    }
}
