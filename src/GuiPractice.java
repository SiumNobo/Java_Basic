import javax.swing.*;

public class GuiPractice {
    public static void main(String[]args)
    {
        JFrame k=new JFrame("App name");
        k.setSize(200,400);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lab=new JLabel("what you want to do");

        JButton button=new JButton("Button 1");
        JButton button1=new JButton("Button 2");

        JPanel pan=new JPanel();
        pan.add(lab);
        pan.add(button);
        pan.add(button1);

        k.add(pan);
        k.setVisible(true);
    }
}
