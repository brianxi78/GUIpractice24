import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Practice1 {

    // declare variables
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private  JTextField textField;

    public static void main(String[] args) {
        Practice1 p = new Practice1();
    }

    public Practice1(){
        // construct variable
        frame = new JFrame("Practice 1");
        panel = new JPanel(new GridLayout(3,1));
        button = new JButton("Click here!");
        label = new JLabel("Label");
        textField = new JTextField();

        // organize the layout
//        panel.add(button, BorderLayout.NORTH);
//        panel.add(label, BorderLayout.CENTER);
        panel.add(button); // order matters in grid and flow layouts
        panel.add(label);
        panel.add(textField);

        frame.add(panel);

        // actually make frame happen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300); //OR (frame.pack();) --> put everything as close as possible and only makes the frame as big as necessary
        frame.setVisible(true);
    }

}
