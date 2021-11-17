package Practiceforclasstest3;

import javax.swing.*;
import java.awt.*;

public class Guta {
    public static void main(String[] args) {
        JFrame frame = new JFrame("App Little");
        frame.setSize(200,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel big=new JPanel();
        JPanel sm1=new JPanel();
        JPanel sm2=new JPanel();

        JLabel label=new JLabel("Label");
        JTextField j=new JTextField(10);
        j.setText("Texfeild");
        sm1.add(label);
        sm1.add(j);

        Button bu1=new Button("Button1");
        Button bu2=new Button("Button2");
        Button bu3=new Button("Button3");
        sm2.add(bu1);
        sm2.add(bu2);
        sm2.add(bu3);

        big.add(sm1);
        big.add(sm2);

        frame.add(big);
        frame.setVisible(true);


    }
}
