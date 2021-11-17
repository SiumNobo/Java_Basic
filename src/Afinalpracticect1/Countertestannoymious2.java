package Afinalpracticect1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Countertestannoymious2 implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton increment,reset;
    public Countertestannoymious2()
    {
        frame=new JFrame("Siumapp");
        frame.setSize(200,300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel lab=new JLabel("press twice to open");
        frame.add(lab);

        textField=new JTextField("0",10);
        increment=new JButton("But1");
        reset=new JButton("But2");
        frame.add(increment);

        frame.add(textField);
        frame.add(reset);

        frame.setVisible(true);

        increment.addActionListener(this);
        reset.addActionListener(this);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object ob=e.getSource();
        if(ob==increment)
            textField.setText(Integer.parseInt(textField.getText())+1+"");

        if(ob==reset)
            textField.setText("0");


    }
    public static void main(String[]args)
    {
        new Countertestannoymious2();
    }
}
