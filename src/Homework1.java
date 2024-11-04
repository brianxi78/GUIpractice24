import javax.swing.*;
import java.awt.*;

public class Homework1 {

    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    private JLabel label2;

    public static void main(String[] args) {
        Homework1 h = new Homework1();
    }

    public Homework1(){
        frame = new JFrame("Example with Grid Layout");
        panel = new JPanel(new GridLayout(2,2));
        button1 = new JButton("Button 1");
        label1 = new JLabel("Label 1!");
        button2 = new JButton("Button 2");
        label2 = new JLabel("Label 2!");

        panel.add(label1);
        panel.add(button1);
        panel.add(button2);
        panel.add(label2);


        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300); //OR (frame.pack();) --> put everything as close as possible and only makes the frame as big as necessary
        frame.setVisible(true);
    }
}
