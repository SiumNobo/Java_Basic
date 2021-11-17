package GuiTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Annoynimousk implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton bu1,bu2;
    public Annoynimousk()
    {
        frame=new JFrame("siumm");
        frame.setSize(200,300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lab=new JLabel("two to open");
        frame.add(lab);
        textField=new JTextField("0",5);
        bu1=new JButton("increment");
        bu2=new JButton("Decrement");

        frame.add(bu1);
        frame.add(textField);
        frame.add(bu2);

        frame.setVisible(true);

        bu1.addActionListener(this);
        bu2.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob=e.getSource();
        if(ob==bu1)
            textField.setText(Integer.parseInt(textField.getText())+1+"");

        if(ob==bu2)
            textField.setText("0");


    }
    public static void main(String[]args)
    {
        new Annoynimousk();
    }
}
