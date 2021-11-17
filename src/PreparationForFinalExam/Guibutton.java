package PreparationForFinalExam;
import javax.swing.*;
public class Guibutton {
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.setSize(400,800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button= new JButton("Click!");
        f.add(button);
        f.setVisible(true);
    }
}
