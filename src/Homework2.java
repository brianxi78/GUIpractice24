import javax.swing.*;
import java.awt.*;

public class Homework2 {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private  JTextField textField;
    private  JTextField textField2;

    public static void main(String[] args) {
        Homework2 h = new Homework2();
    }

    public Homework2(){
        frame = new JFrame("Example with Border Layout");
        panel = new JPanel(new BorderLayout());
        button = new JButton("Button 1");
        label = new JLabel("Label!");
        textField = new JTextField();
        textField2 = new JTextField();

        panel.add(button, BorderLayout.NORTH);
        panel.add(label, BorderLayout.WEST);
        panel.add(textField2, BorderLayout.SOUTH);
        panel.add(textField);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300); //OR (frame.pack();) --> put everything as close as possible and only makes the frame as big as necessary
        frame.setVisible(true);
    }
}
