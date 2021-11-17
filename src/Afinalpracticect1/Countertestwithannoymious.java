package Afinalpracticect1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Countertestwithannoymious {

    public Countertestwithannoymious() {

        JFrame frame;
        JTextField textField;
        frame = new JFrame("New");
        frame.setSize(200, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JLabel lab = new JLabel("Click here to open");
        frame.add(lab);


        textField = new JTextField(10);
        textField.setText("0");
        frame.add(textField);

        Button but = new Button("Button1");
        frame.add(but);

        ActionListener ob = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(Integer.parseInt(textField.getText())+1+"");
            }
        };


        but.addActionListener(ob);
        frame.setVisible(true);

    }

        public static void main(String[]args)
        {
                new Countertestwithannoymious();
        }


    }

