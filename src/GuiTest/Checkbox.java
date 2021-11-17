package GuiTest;

import javax.swing.*;
import java.awt.*;

public class Checkbox {
    JFrame frame;

    public Checkbox()
    {

        frame=new JFrame("Date App Account");
        frame.setSize(400,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);
        JLabel nm=new JLabel("Name");
        JTextField tm=new JTextField(5);
        tm.setText("Enter Your name");
        JLabel gen=new JLabel("Gender");
        JCheckBox fm=new JCheckBox("Male");
        JCheckBox ml=new JCheckBox("Female");
        JLabel label=new JLabel("Note");
        JTextArea jk=new JTextArea(5,10);
        jk.setText("Say something About you");
        TextArea tx=new TextArea(5,10);
        Button bu1=new Button("Find Your better half");

        nm.setBounds(10,20,50,20);
        frame.add(nm);
        tm.setBounds(60, 20, 200, 20);
        frame.add(tm);
        gen.setBounds(10,50,50,20);
        frame.add(gen);
        fm.setBounds(60, 50, 80, 20);
        frame.add(fm);
        ml.setBounds(140, 50, 100, 20);
        frame.add(ml);
        label.setBounds(10, 80, 40, 20);
        frame.add(label);
        tx.setBounds(60, 80, 200, 120);
        frame.add(tx);
        bu1.setBounds(160, 210, 140, 20);
        frame.add(bu1);

        frame.setVisible(true);




    }
    public static void main(String[]args)
    {
        new Checkbox();
    }
}
