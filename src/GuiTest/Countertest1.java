package GuiTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Countertest1 extends JFrame implements ActionListener {
    JFrame frame;
    JTextField textField;
    JTextField tf2;
    public Countertest1()
    {

        frame=new JFrame("App Counter");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JLabel("Counter"));
        textField=new JTextField(10);
        frame.add(textField);
        textField.setText("0");
        Button but=new Button("Count");
        frame.add(but);
        but.addActionListener(this);

        JLabel jk=new JLabel ("Decrement");
        frame.add(jk);
        tf2.add(new JTextField(10));
        frame.add(tf2);
        tf2.setText("1");
        Button b2=new Button("Count2");
        frame.add(b2);
        b2.addActionListener(this);

        frame.setVisible(true);


            }






    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText(Integer.parseInt(textField.getText()) +1+"");
        tf2.setText(Integer.parseInt(tf2.getText())+ 1+ "");

    }

    public static void main(String[]args)
    {
Countertest1 t=new Countertest1();
    }
}
