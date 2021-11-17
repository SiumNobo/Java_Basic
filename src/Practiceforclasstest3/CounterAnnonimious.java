package Practiceforclasstest3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterAnnonimious {
    public static void main(String[]args)
    {
        JFrame frame=new JFrame("App Tittle");
        frame.setSize(200,300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Counter");
        JTextField tk=new JTextField(10);
        tk.setText("0");
        frame.add(label);
        frame.add(tk);
        JButton bu=new JButton("Tip");
        frame.add(bu);
        ActionListener e=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tk.setText(Integer.parseInt(tk.getText())+1+"");
            }

        };
        bu.addActionListener(e);
        frame.setVisible(true);

    }
}
