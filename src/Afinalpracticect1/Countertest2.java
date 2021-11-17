package Afinalpracticect1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Countertest2 implements ActionListener {
    JFrame frame;
    JTextField textField;
    public Countertest2(){
        frame=new JFrame("App Tittle");
        frame.setSize(200,300);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(new JLabel("press twice to open"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField=new JTextField(20);
        textField.setText("0");
        frame.add(textField);
        Button but=new Button("Open");
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
        new Countertest2();
    }
}
