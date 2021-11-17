package Afinalpracticect1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Countertest implements ActionListener {
    JFrame frame;
    JTextField textField;
    public Countertest()
    {
        frame=new JFrame("Countertest");
        frame.setSize(150,300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.gray);
        frame.add(new JLabel("Meow"));


        textField=new JTextField(10);
        textField.setText("0");
        frame.add(textField);
        Button but=new Button("Sound");
        frame.add(but);
        but.addActionListener(this);
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText(Integer.parseInt(textField.getText())+1+"");

    }
    public static void main(String[]args)
    {
        new Countertest();
    }
}
