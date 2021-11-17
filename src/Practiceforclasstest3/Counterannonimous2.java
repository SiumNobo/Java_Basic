package Practiceforclasstest3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counterannonimous2 implements ActionListener {
    JFrame frame;
    JTextField set;
    JTextField Reset;
    JButton bu,re;
    public Counterannonimous2()
    {
        frame=new JFrame();
        frame.setSize(200,300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lab=new JLabel("Press 2");
        frame.add(lab);
        set =new JTextField("0",10);
        frame.add(set);
        Reset=new JTextField();
        frame.add(Reset);
        Button bu=new Button("increment");
        Button re=new Button("Reset");
        frame.add(bu);
        bu.addActionListener(this);
        frame.add(re);
        re.addActionListener(this);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
      Object ob=e.getSource();
      if(ob==bu)
      {
          set.setText(Integer.parseInt(set.getText())+1+"");
      }
        else if (ob==re)
      {
          set.setText("0");
      }

    }

    public static void main(String[]args)
    {
        new Counterannonimous2();
    }
}
