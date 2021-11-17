package GuiTest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BgColorChange {
    public BgColorChange() {
        JFrame f = new JFrame();
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setBackground(Color.CYAN);

        JButton change =  new JButton("Change");
        JButton reset =  new JButton("reset");

        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.setBackground(Color.BLUE);
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.setBackground(Color.WHITE);
            }
        });

        p.add(change);
        p.add(reset);

        f.add(p);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BgColorChange();
    }
}
