import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassmateChallenge implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JPanel grid;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField text;

    public static void main(String[] args) {
        ClassmateChallenge c = new ClassmateChallenge();
    }

    public ClassmateChallenge(){
        frame = new JFrame("Classmate Challenge");
        panel = new JPanel(new BorderLayout());
        grid = new JPanel(new GridLayout(2,2));
        button1 = new JButton("Enter");
        button1.addActionListener(this);
        button2 = new JButton("Button");
        button3 = new JButton("Button");
        label1 = new JLabel("Label");
        label2 = new JLabel("Label");
        label3 = new JLabel("Label");
        text = new JTextField("Text Field");
        frame.add(panel);

        panel.add(label1, BorderLayout.NORTH);
        panel.add(button1, BorderLayout.EAST);
        panel.add(grid);
        grid.add(label2);
        grid.add(text);
        grid.add(button2);
        grid.add(label3);
        panel.add(button3, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Enter"){
            String Text = text.getText();
            label3.setText(Text);
        }
    }
}