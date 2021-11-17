package classtest3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    public static void main(String[] args) {
        JFrame f = new JFrame( "Oceans App");
        f. setSize (300, 150);
        f.setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE);
        f.setLayout (new FlowLayout());

        JTextField tf1 = new JTextField (20) ;
        JTextField tf2 = new JTextField (20) ;

        JButton btn =  new JButton("submit");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tf1.setText(Integer.parseInt(tf1.getText()) / 10 + "");
                tf2.setText(Integer.parseInt(tf1.getText()) * 10 + "");
            }
        });
        f.add(tf1);
        f.add(tf2);
        f.add(btn);
        f.setVisible (true) ;
    }
}