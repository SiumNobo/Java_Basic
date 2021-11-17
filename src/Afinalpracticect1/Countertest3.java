package Afinalpracticect1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Countertest3 {
    JFrame frame;
    JTextField textField;
    public Countertest3() {
        frame=new JFrame("App name");
        frame.setSize(200,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel jk=new JLabel("Press twice to open");
        frame.add(jk);
        textField=new JTextField(10);
        textField.setText("0");
        frame.add(textField);
        Button but=new Button("Press 2");
        but.setBounds(100,23,44,2);
        frame.add(but);

        but.addActionListener(new Countertest4());
        frame.setVisible(true);



    }

    public class Countertest4 implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            String text=textField.getText();
            int Count=Integer.parseInt(text)+1;
            textField.setText(Count+"");


            //textField.setText(Integer.parseInt(textField.getText())+1+"");
        }
    }
    public static void main(String[]args)
    {
        new Countertest3();
    }
}
